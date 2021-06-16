public class Triangle{
    public static void main(String[] args) {
        
        int x = 5;

        for (int i = 0; i < x; i++) { // ควบคุมจำนวนบรรทัด
            for (int j = 0; j <= i; j++) { // ควบคุมจำนวน *
                System.out.print("*"); // วาดรูป *
            }
            System.out.println(); // เมื่อจบแต่ละบรรทัดขึ้นบรรทัดใหม่
        }
        System.out.println(); // เมื่อวาดเสร็จทำการขึ้นบรรทัดใหม่
    }
}