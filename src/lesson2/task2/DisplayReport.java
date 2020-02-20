package lesson2.task2;

public class DisplayReport implements SendReportTo {
    @Override
    public void output(Report report) {
        System.out.println("Output to display");
        for(ReportItem item : report.getItems()){
            System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
