public class EReader extends DispositivoMovil{
    private String libro_actual;
    public EReader(){
        super(0);
    }

    public void abrirLibro(String libro){
        this.libro_actual = libro;
            if (libro_actual != null) {
                System.out.println("Abriendo libro: " + libro_actual);
            } else {
                System.out.println("No se ha abierto ningún libro");

         }
    
    }



}