public class BlankSquare {
        public static void main(String[] args) {
            int count = 13;
    
            System.out.println("x");
            for (int i = 0; i < count; i++) { // ควบคุมจำนวนบรรทัดเท่ากับ count
                for (int j = 0; j < count; j++) { // ควบคุมจำนวนที่จะวาดแต่ละบรรทัด
                    if (i == 0 || i == (count - 1)) { // บรรทัดแรกและบรรทัดสุดท้าย
                        System.out.print("x");
                    } else {
                        if (j == 0 || j == (count - 1)) { // ตำแหน่งแรกและตำแหน่งสุดท้าย
                            System.out.print("x");
                        } else {
                            System.out.print(" ");
                        }
                    }
    
                }
                System.out.println();
            }
            System.out.println();
        }
}
