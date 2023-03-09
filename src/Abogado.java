public class Abogado extends Empleado{

    @Override
    public int getVacaciones (){
        return super.getVacaciones() / 2;
    }

    @Override
    public double getSalario (){
        return super.getSalario() + 1000;
    }




}
