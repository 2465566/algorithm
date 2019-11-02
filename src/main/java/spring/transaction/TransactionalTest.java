//
//package spring.transaction;
//
//import com.deepblueai.product.domain.model.ProductInfo;
//import com.deepblueai.product.service.ProductService;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *   演示  @Transactional 内部调用，事物失效
// */
//@Component
//public class TransactionalTest implements ApplicationContextAware {
//
//    @Autowired
//    private ProductService productService;
//    private TransactionalTest transactionalTest;
//
//    public void action() {
//        ProductInfo pr = productService.getProductByBarCode("8852126004101");
//        int cnt = productService.updateByPrimaryKey(pr);
//        System.out.println(cnt);
//        /**
//         * this.updateName() 没有事物代理 updateName 事物失效
//         */
//        //updateName();
//
//        /**
//         * 重新从工厂获取或者autowired注入bean 再通过外部调用，有事物代理 updateName 事物有效
//         */
//        transactionalTest.updateName();
//    }
//
//    @Transactional
//    public void updateName() {
//        ProductInfo pr = productService.getProductByBarCode("8852126006006");
//        pr.setProductShortName("xxx");
//        productService.updateByPrimaryKey(pr);
//        int i = 1 / 0;
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.transactionalTest = applicationContext.getBean(TransactionalTest.class);
//    }
//}

