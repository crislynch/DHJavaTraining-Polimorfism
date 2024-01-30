public class triangolo extends Forma{
    @Override
    public void calcolaArea(int base, int altezza) {
        int area = (base * altezza)/2;
        System.out.println("Il triangolo ha area di: " + area);
    }
}
