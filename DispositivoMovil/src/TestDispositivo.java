public class TestDispositivo {
	public static void main(String[] args){
		Laptop lap = new Laptop();
		lap.encender();
		lap.verCargaBateria();
		lap.apagar();

		Celular cel = new Celular ("123-4567890");
		cel.encender();
		cel.verCargaBateria();
		cel.llamar("098-7654321");
		lap.apagar();
		cel.apagar();
	}
}