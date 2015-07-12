public class ConversorLivre {

	public float celciusParaFarenheit(float celcius){
		return (celcius * 9 / 5) + 32;
	}
	public float celciusParaKelvin(float celcius){
		return (float) (celcius + 273.15);
	}
	public float farenheitParaCelcius (float farenheit){
		return (farenheit - 32) * 5 / 9;
	}
	public float farenheitParaKelvin(float farenheit){
		return (float) ((farenheit - 32) * 5 / 9) - 273.15f;
	}
	public float kelvinParaCelcius(float kelvin){
		return (kelvin - 273.15f);
	}
	public float kelvinParaFarenheit(float kelvin){
		return (((kelvin - 273.15f) * 9 / 5) + 32);
	}
}
