package algorithm.leetcode;

/**
 * 在某次实弹射击训练中，班长将十个战士围成一圈发子弹。首先，班长给第一个战士10颗，第二个战士2颗，第三个战士8颗，第四个战士22颗，第五个战士16颗，
 * 第六个战士4颗，第七个战士10颗，第八个战士6颗，第九个战士14颗，第十个战士20颗。然后按如下方法将每个战士手中的子弹进行调整：所有的战士检查自己手中的子弹数，
 * 如果子弹数为奇数，则向班长再要一颗。然后每个战士再同时将自己手中的子弹分一半给下一个战士（第10 个战士将手中的子弹分一半给第1个战士).
 * 问需要多少次调整后，每个战士手中的子弹数都相等？每人各有多少颗子弹？
 * 要求输出每轮调整后各战士手中的子弹数。
 * <p>
 * 思路
 * 这题难度一般,就是烦,我也没能想到更好的算法首先就有一个很重要的问题就是检验每个战士是否相等。如果不加限制的判断的话就会导致出现O（n^2）的可能,
 * 所以我在这里用了一个总子弹数对士兵数取模的操作, 这样可以保证只有在值为0的时候是可以出现平均分的情况的,这样可以大大减少循环的次数。之后就是比较平常的操作了。
 */

public class DistributionBullet {

    public static void main(String[] args) {
        int[] r = new int[]{1, 3, 5};
        fenZiDan(r);
    }


    public static void fenZiDan(int[] shibing) {
        int total = 0;//子弹总数
        int times = 0;//次数
        int[] temp = new int[shibing.length];//临时记录士兵第一次交出子弹后的数量
        for (int i = 0; i < shibing.length; i++) {
            total += shibing[i];
        }
        while (true) {//循环执行任务
            times++;
            for (int i = 0; i < shibing.length; i++) {
                if (shibing[i] % 2 != 0) {
                    total++;//向班长要一颗子弹
                    temp[i] = (shibing[i] + 1) / 2;
                } else {
                    temp[i] = shibing[i] / 2;
                }
            }
            for (int i = 0; i < shibing.length; i++) {
                if (i > 0) {
                    shibing[i] = temp[i - 1] + temp[i];    //士兵交出的子弹数量==剩余的子弹数量  交换一次后，当前士兵子弹数量=上个士兵给自己的数量+自己本身的子弹数量
                } else {
                    shibing[i] = temp[i] + temp[temp.length - 1];  //如果是第一个适量，那么最终子弹刷领=最后一个士兵分给自己的数量+自己本身的子弹还数量
                }
                if (i != shibing.length - 1) {
                    System.out.print(shibing[i] + " ");
                } else {
                    System.out.println(shibing[i] + " ");
                }
            }

            if (total % shibing.length == 0) {//表示可以平均分,是子弹都相等的必要不充分条件,只有此时才会进行检查
                boolean isEnd = true;
                for (int i = 1; i < shibing.length; i++) {
                    if (shibing[0] != shibing[i]) {
                        isEnd = false;
                        break;
                    }
                }
                if (isEnd) {
                    break;
                }
            }
        }
        System.out.println("总共进行了" + times + "次");
    }
}
