public class Main{
    public static void main(String [] args){
        Product product1=new Product(1,"Lenevo",2000,"32 gb");// referance yaratmaq


        Product product2=new Product();
        product2.id=2;
        product2.name="HP";
        product2.unitPrice=12000;
        product2.detail="16 gb ram";

        Product product3=new Product();
        product3.id=3;
        product3.name="Acer";
        product3.unitPrice=16000;
        product3.detail="16 gb ram";

        Product[] products={product1,product2,product3};
        System.out.println(products.length);

        for(Product product : products){
            System.out.println(product.name);
        }

        Category category1=new Category();
        category1.id=1;
        category1.name="Bilgisaray";

        Category category2=new Category();
        category2.id=2;
        category2.name="Ev/Bahce";

        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);

        productManager.addToCart(product3);



    }
}
