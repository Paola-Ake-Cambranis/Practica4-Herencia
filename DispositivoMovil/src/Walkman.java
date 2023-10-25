public class Walkman extends DispositivoMovil{

    private String cancion_actual;

    public Walkman(){
        super(0);
    }

    public void reproducirCancion (String cancion){
        this.cancion_actual = cancion;
        System.out.println("Reproduciendo la canción:" + cancion);
        }
    public void pausarCancion() {
        if (cancion_actual != null) {
            System.out.println("Pausando la canción: " + cancion_actual);
        } else {
            System.out.println("No se está reproduciendo ninguna canción.");
     }
  }
}