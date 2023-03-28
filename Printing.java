package SalarySlip;

public class Printing {
    MessageReader messageReader = new MessageReader();
    
    public void printSalarySlip(Emplyee emp) {
        System.out.println(messageReader.getMessage("id.label")+emp.getId());
        System.out.println(messageReader.getMessage("name.label")+ emp.getName());
        System.out.println(messageReader.getMessage("salary.label") + emp.getSalary());
        System.out.println(messageReader.getMessage("hra.label") + emp.getEmplyeeOperation().hra());
        System.out.println(messageReader.getMessage("da.label") + emp.getEmplyeeOperation().da());
        System.out.println(messageReader.getMessage("ta.label") + emp.getEmplyeeOperation().ta());
        System.out.println(messageReader.getMessage("ma.label") + emp.getEmplyeeOperation().ma());
        System.out.println(messageReader.getMessage("pf.label") + emp.getEmplyeeOperation().pf());
        System.out.println(messageReader.getMessage("tax.label") + emp.getEmplyeeOperation().tax());
        System.out.println(messageReader.getMessage("gs.label") + emp.getEmplyeeOperation().gs());
        System.out.println(messageReader.getMessage("ns.label") + emp.getEmplyeeOperation().ns());
    }
}
