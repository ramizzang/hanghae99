package week03.poly;

public class HankookTire extends Tire { // Tire class 상속받음

    public HankookTire(String company) {
        super(company);
    }

    @Override
    public void rideComfort() {
        System.out.println(super.company + " 타이어 승차감은 " + 100);
    }
}