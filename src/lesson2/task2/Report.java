package lesson2.task2;

import java.util.*;
class Report{
    private List<ReportItem> items; // Отчетные данные

    public List<ReportItem> getItems() {
        return items;
    }

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }
}
