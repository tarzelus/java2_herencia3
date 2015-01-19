public class Profesores extends Escuela{


	private String nombreProfe;
	private int idProfe;
	private String tipoProfe;
	private String horarioProfe;

        public Profesores() {
		super();
        }

	// getter y setter

		public String getNombreProfe()
		{
			return nombreProfe;
		}
		
		public void  setNombreProfe(String nombreProfe1)
		{
			nombreProfe=nombreProfe1;
		}
		
		
		
		public int getIdProfe()
		{
			return idProfe;
		}
		
		public void  setIdProfe(int idProfe1)
		{
			idProfe=idProfe1;
		}

		
		
		public String getTipoProfe()
		{
			return tipoProfe;
		}
		
		public void  setTipoProfe(String tipoProfe1)
		{
			tipoProfe=tipoProfe1;
		}


		public String getHorarioProfe()
		{
			return horarioProfe;
		}
		
		public void  setHorarioProfe(String horarioProfe1)
		{
			horarioProfe=horarioProfe1;
		}
	
}
