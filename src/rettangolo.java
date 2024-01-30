public class rettangolo extends Forma{
    @Override
    public void calcolaArea(int base, int altezza) {
        int area = base * altezza;
        System.out.println("Il rettangolo ha area di: " + area);
    }
}