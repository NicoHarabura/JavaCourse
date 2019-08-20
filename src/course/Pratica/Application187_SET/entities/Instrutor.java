package course.Pratica.Application187_SET.entities;

public class Instrutor {

	private Character curso;
	private Integer idAluno;
	
	public Instrutor(Character curso, Integer idAluno) {
		super();
		this.curso = curso;
		this.idAluno = idAluno;
	}

	public Character getCurso() {
		return curso;
	}

	public void setCurso(Character curso) {
		this.curso = curso;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAluno == null) ? 0 : idAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrutor other = (Instrutor) obj;
		if (idAluno == null) {
			if (other.idAluno != null)
				return false;
		} else if (!idAluno.equals(other.idAluno))
			return false;
		return true;
	}
	
	
	
}
