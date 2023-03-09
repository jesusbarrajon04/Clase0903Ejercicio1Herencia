public class Abogado extends Empleado{

    @Override
    public int getVacaciones (){
        return super.getVacaciones() / 2;
    }

    @Override
    public double getSalario (){
        return super.getSalario() + 1000;
    }

    @Override
    public int getHoras (){
        return super.getHoras() + 5;
    }

    public void mensaje (){
        System.out.println("Estoy en el tribunal");
    }

}
