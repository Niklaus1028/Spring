package cn.tedu.dao;

/**
 * @author XiangRui
 * @create 2020-03-05 9:43 下午
 */
public class ProdDao {
    public ProdDao() {
        System.out.println("ProdDao被创建。。。。");
    }

    public void init() {
        System.out.println("init。。连接数据库。。。。。");
    }

    public void destory() {
        System.out.println("destory。。断开数据库。。。。。");
    }

    public void addProd() {
        System.out.println("增加商品。。");
    }

    public void updateProd() {
        System.out.println("修改商品。。");
    }

    public void delProd() {
        System.out.println("删除商品。。");
    }

    public void queryProd() {
        System.out.println("查询商品。。");
    }
}
