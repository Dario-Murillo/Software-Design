public abstract class CustomersBase {
    private DataObject dataObject;

    public void setData(DataObject dataObject) {
        this.dataObject = dataObject;
    }

    public void next() {
        dataObject.nextRecord();
    }

    public void prior() {
        dataObject.priorRecord();
    }

    public void add(String customer) {
        dataObject.addRecord(customer);
    }

    public void delete(String customer) {
        dataObject.deleteRecord(customer);
    }

    public void show() {
        dataObject.showRecord();
    }

    public void showAll() {
        dataObject.showAllRecords();
    }
}
