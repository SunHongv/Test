package FirstHeadDesign.Factory;

public class FacTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PizzStore store = new BeijingPizzStore();
        Pizz pizz = store.OderPizz("cheese");
    }

}
