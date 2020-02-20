package lesson2.task2;

class PrintReport implements SendReportTo {
    @Override
    public void output(Report report){
        System.out.println("Output to printer");
        for(ReportItem item : report.getItems()){
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
