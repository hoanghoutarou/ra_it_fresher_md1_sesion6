package Bai1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productid,productName,description;
    private float price;
    private Date created;
    private int catalogId, productStatus;

    public Product() {
    }

    public Product(String productid, String productName, String description, float price, Date created, int catalogId, int productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }
    public  void inputData(Scanner sc, Product[] arrProduct, int index, Categories[] arrCategories){
        System.out.println("Nhap ma san pham:");
        this.productid=sc.nextLine();
        System.out.println("Nhap ten san pham:");
        this.productName=sc.nextLine();
        System.out.println("Nhap gia san pham");
        this.price=Float.parseFloat(sc.nextLine());
        System.out.println("Nhap mo ta san pham");
        this.description=sc.nextLine();
        System.out.println("Nhap ngay nhap san pham:");
        this.created = dt.parse(sc.nextLine());
        System.out.println("Nhap ma danh muc san pham:");
        this.catalogId=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap trang thai san pham");
        this.productStatus=Integer.parseInt(sc.nextLine());
    }
    public void displayData(){
        System.out.printf("Ma san pham: %s \n Ten san pham: %s \n Gia san pham: %3f \n Mo ta: %s \n Ngay Nhap: %s \n Ma danh muc: %d \n  Trang thai: %s",
                this.productid,this.productName,this.price,this.description,this.created,this.catalogId,this.productStatus);
    }
}
