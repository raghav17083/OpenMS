public class Store extends Inventory {
    int warehouse;
    String record;

    Store(int _warehouse,String _name, String _ID)
    {
        super(_name,_ID);
        warehouse = _warehouse;
    }

}
