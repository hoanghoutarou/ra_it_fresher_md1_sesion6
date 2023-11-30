package Bai2;

import Bai1.Categories;
import Bai1.Product;

import java.util.Scanner;

public class ShopManagement {
    public static void main(String[] args) {
        Categories[] arrCategories = new Categories[100];
        Product[] arrProduct = new Product[100];
        int index=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm\n");
            System.out.println("3. Thoát");
            int choiceMenu =Integer.parseInt(sc.nextLine());
            switch (choiceMenu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap tu 1 den 2");
            }
            System.out.println("********************CATEGORIES MENU***********");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục\n");
            System.out.println("6. Thoát");
            int choiceCat = Integer.parseInt(sc.nextLine());
            switch (choiceCat){
                case 1:
                    System.out.println("Nhap so danh mục");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i=0;i<n;i++) {
                        arrCategories[index] = new Categories();
                        arrCategories[index].inputData(sc, arrCategories, index);
                        index++;
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị thông tin các danh mục");
                    for (int i =0; i<index;i++){
                        arrCategories[index].displayData();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap tu 1 den 6");
                    break;
            }
            System.out.println("*******************PRODUCT MANAGEMENT*****************");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phim)");
            System.out.println("8. Thoát");
            int choicePro = Integer.parseInt(sc.nextLine());
            switch (choicePro){
                case 1:
                    System.out.println("Nhap so sản phẩm");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i=0;i<n;i++) {
                        arrProduct[index] = new Product();
                        arrProduct[index].inputData(sc, arrProduct, index, arrCategories);
                        index++;
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị thông tin các sản phẩm");
                    for (int i =0; i<index;i++){
                        arrProduct[index].displayData();
                    }
                    break;
                case 3:
                    System.out.println("Sap xep cac san pham");
                    for (int i =0; i<index -1 ;i++){
                        for (int j =i+1; j<index;i++){
                            if(arrProduct[i].getPrice()>arrProduct[j].getPrice()){
                                Product temp = arrProduct[i];
                                arrProduct[i]=arrProduct[j];
                                arrProduct[j]=temp;
                            }
                        }
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Nhap ten san pham");
                    String NameSearch = sc.nextLine();
                    for (int i =0; i<index;i++){
                        if(arrProduct[i].getProductName().equals(NameSearch)){
                            arrProduct[i].displayData();
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap tu 1 den 6");
                    break;
            }
        }while (true);

    }

}
