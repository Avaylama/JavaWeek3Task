// public class discountCalculator{
//     public static void main(String[] args){
//         double foodPrice = 10.2;
//         double foodDiscount = 0.5;
//         double foodDiscountPrice = foodPrice * foodDiscount;
//         double foodFinalPrice = foodPrice - foodDiscount;

//         double clothesPrice = 1200;
//         double clothesDiscount = 0.02;
//         double clothesDiscountPrice = clothesPrice * clothesDiscount;
//         double clothesFinalPrice = clothesPrice - clothesDiscountPrice;
//         }
// }


//using methods

public class discountCalculator{

    static void calculateDiscount(double price, double discount){
        double discountPrice = price * discount;
        double finalPrice = price - discountPrice;
        System.out.println(finalPrice);

    }
    public static void main(String[] args){
        double foodPrice = 10.2;
        double foodDiscount = 0.5;
        calculateDiscount(foodPrice, foodDiscount);
        

        double clothesPrice = 1200;
        double clothesDiscount = 0.02;
        calculateDiscount(clothesPrice, clothesDiscount);
        }
}