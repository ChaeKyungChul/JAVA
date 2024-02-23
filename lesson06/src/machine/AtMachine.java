package machine;

public class AtMachine {
   private Product[] tray1 = new Product[5];
   private Product[] tray2 = new Product[5];
   private Product[] tray3 = new Product[5];
   private Product[] tray4 = new Product[5];
   
   private int money;  //자판기에 넣은 돈
   
   //각각 5개씩 있는 상품들을 배열에 넣음 (2차원 배열)
   private Product[][] arr = { tray1, tray2, tray3, tray4 };  
   
   //생성자에서 상품을 셋팅 - 상품을 자판기 안에 셋팅함
   public AtMachine() {
      for(int i = 0; i < tray1.length; i++) {
         tray1[i] = new Product("콜라", 800);
      }
      for(int i = 0; i < tray2.length; i++) {
         tray2[i] = new Product("사이다", 700);
      }
      for(int i = 0; i < tray3.length; i++) {
         tray3[i] = new Product("냉커피", 900);
      }
      for(int i = 0; i < tray4.length; i++) {
         tray4[i] = new Product("미에로화이바", 500);
      }
   }
   
   //최소 가격을 구하는 함수 (자판기만 판단하면 되므로 private)
   private int getMinPrice() {
      int minPrice = 9999999;
      for(int i = 0; i < arr.length; i++) { //tray1 ~ tray4 
         for(int j=0; j<arr[i].length; j++) {
            if(arr[i][j] != null && arr[i][j].getPrice() < minPrice) {
               minPrice = arr[i][j].getPrice();
            }
         }
      }
      return minPrice;
   }
   
   //돈을 입력받는 함수 (충분한지 판단)
   public boolean inputMoney(int money) {
      this.money += money;
      int minPrice = getMinPrice();
      return this.money >= minPrice;
   }
   
   //실제 상품의 개수를 세어주는 함수 - 몇 개인지는 자판기만 알면 되니 private
   private int countOfTray(Product[] tray) {
      int count = 0;
      for(int i = 0; i < tray.length; i++) {
         if(tray[i] != null) {
            count++;
         }
      }
      return count;
   }
   
   //상품내용, 수량 출력하는 함수
   void show() {
      System.out.println();
      System.out.printf("%s (%d개)\n", tray1[0].toString(), countOfTray(tray1));
      System.out.printf("%s (%d개)\n", tray2[0].toString(), countOfTray(tray2));
      System.out.printf("%s (%d개)\n", tray3[0].toString(), countOfTray(tray3));
      System.out.printf("%s (%d개)\n", tray4[0].toString(), countOfTray(tray4));
   }
   
   //거스름돈 반환 하는 함수
   public int getChange() {
      int change = this.money;
      this.money = 0;
      return change;
   }
   
   //금액이 충분한지 판별하는 함수
   public boolean isEnoughMoney() {
      return getMinPrice() <= money;
   }
   
   //상품을 반환하는 함수
   public Product getProduct(int select) {
      select -= 1;
      Product product = null;
      for(int i = arr[select].length -1; i != 0; i--) {
         //물건이 있어야 판다.
         //상품의 가격이 입력된 돈보다 작거나 같아야 한다.
         boolean flag1 = arr[select][i] != null;
         boolean flag2 = flag1 && arr[select][i].getPrice() <= money;
         if(flag2) {
            product = arr[select][i];  //상품을 출력
            arr[select][i] = null;  //원래 상품이 있던 자리는 빈칸으로 만든다.
            money -= product.getPrice();  //넣은 돈에서 상품 금액만큼 차감한다.
            break;
         }
      }
      return product;
   }
   
}