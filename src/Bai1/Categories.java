package Bai1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Categories {
   private int catalogId;
   private String catalogName,descriptions;
   private Boolean catalogStatus;

    public Categories() {
    }
    public Categories(int catalogId, String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    public void inputData (Scanner sc, Categories[] arrCategories, int index){
        System.out.println("Nhap ma danh muc:");
        this.catalogId=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten danh muc");
        this.catalogName=sc.nextLine();
        System.out.println("Nhap mo ta:");
        this.descriptions=sc.nextLine();
        System.out.println("Nhap trang thai");
        this.catalogStatus=Boolean.parseBoolean(sc.nextLine());
    }
    public void displayData(){
        System.out.printf("Ma Danh Muc: %d \n Ten danh muc: %s\n Mo ta: %s \n Trang thai: %s ",this.catalogId,this.catalogName,this.descriptions,this.catalogStatus);
    }
}