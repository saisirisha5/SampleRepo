package Hib.hql;



public class Employee
{
   public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

public int eno;
   public String ename;
   public String edept;
   public int esal;



    public Employee(int eno, String ename, String edept, int esal) 
    {
        super();
        this.eno = eno;
        this.ename = ename;
        this.edept = edept;
        this.esal = esal;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }
}
