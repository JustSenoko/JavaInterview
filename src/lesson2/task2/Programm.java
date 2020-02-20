package lesson2.task2;

class Program{
    public static void main(String[] args){
        Report report = new Report();
        report.calculate();

        SendReportTo printer = new PrintReport();
        SendReportTo display = new DisplayReport();

        display.output(report);
        printer.output(report);
    }
}
