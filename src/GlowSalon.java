public class GlowSalon {
     public static void main(String[] args) {
    
        System.out.println("===== GLOW SALON =====");
        String[] items={"Haircut","Shave","Manicure","Braiding"};
        double[] prices={8000,5000,15000,30000};
        int[] quantities ={2,2,1,2};

        double total = 0;
        
        for(int i = 0; i < items.length; i++) {

            double itemTotal=quantities[i] * prices[i];

            //Haircut, 5% off if the order is 3 or more
            if (i == 0 && quantities[i] >= 3) {
                itemTotal= itemTotal-(0.05 * itemTotal); // Apply 5% discount
            }

            //Manicure, 3000 off if the order is 2 or more
            if (i == 2 && quantities[i] >= 2) {
                itemTotal= itemTotal- 3000; // Apply 3000 discount
            }

            // Braiding, 10% off if the order is 5 or more
            if (i == 3 && quantities[i] >= 5) {
                itemTotal= itemTotal-(0.10 * itemTotal); // Apply 10% discount
            }

            total = total+ itemTotal;
        }

        System.out.println("\n===== RECEIPT =====");
        System.out.print("Total = UGX." + total);
        
    }
}
        
        
        


