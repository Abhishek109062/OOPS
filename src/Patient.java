public class Patient
{
    String patientName;
    double height;
    double weight;
    Patient(String patientName,double height,double weight)
    {
        this.patientName=patientName;
        this.height=height;
        this.weight=weight;
    }
    double computeBMI()
    {
        System.out.println();
        return weight/(height*height);
    }

    public static void main(String[] args)
    {
        Patient p=new Patient("Nishchal",5.6,100);
        System.out.println(p.computeBMI());
    }
}
