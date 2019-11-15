package practise.excel;

import com.google.common.collect.Lists;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ExcelHandler {

    public static void main(String[] args) {
        Workbook wb = null;
        Sheet sheet = null;
        Row row = null;
        List<Map<String, String>> list = null;
        String cellData = null;
        String filePath = "/Users/juntao/Desktop/11.xlsx";
        String columns[] = {"get", "put"};

        List<Double> firstColumn = Lists.newArrayList();
        List<Double> secondColumn = Lists.newArrayList();
        wb = readExcel(filePath);
        if (wb != null) {
            list = new ArrayList<Map<String, String>>();
            sheet = wb.getSheetAt(0);
            int rownum = sheet.getPhysicalNumberOfRows();
            row = sheet.getRow(0);
            int colnum = row.getPhysicalNumberOfCells();
            for (int i = 1; i < rownum; i++) {
                Map<String, String> map = new LinkedHashMap<String, String>();
                row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 0; j < colnum; j++) {
                        cellData = (String) getCellFormatValue(row.getCell(j));
                        if (j == 0 && !StringUtils.isEmpty(cellData)) {
                            firstColumn.add(Double.valueOf(cellData.replace("-", "")));
                        }
                        if (j == 1 && !StringUtils.isEmpty(cellData)) {
                            secondColumn.add(Double.valueOf(cellData.replace("-", "")));
                        }
                    }
                } else {
                    break;
                }
            }
            List<Double> result = Lists.newArrayList();

            AtomicInteger cc = new AtomicInteger();

            firstColumn.stream().distinct().forEach(input -> {
                if (secondColumn.contains(input)) {
                    if (input == 1000.00) {
                        cc.getAndIncrement();
                    }
                    result.add(input);
                }
            });

            for (Double item : result) {
                System.out.printf("%s 该数额---待收贷款---%d次 ---交易金额---%d次\r\n", item,
                        firstColumn.stream().filter(p -> p.equals(item)).count(), secondColumn.stream().filter(p -> p.equals(item)).count());
            }
        }
    }

    public static Workbook readExcel(String filePath) {
        Workbook wb = null;
        if (filePath == null) {
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            if (".xls".equals(extString)) {
                return wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return wb = new XSSFWorkbook(is);
            } else {
                return wb = null;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null) {
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC: {
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                }
                case Cell.CELL_TYPE_FORMULA: {
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cellValue = cell.getDateCellValue();
                    } else {
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING: {
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }

}