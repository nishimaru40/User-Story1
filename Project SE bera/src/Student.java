
public class Student {
	private int index;
	private long id;
	private String name;
	private String type;
	private String status;
	public Student(int index,long id,String name,String type,String status){
		this.index = index;
		this.name = name;
		this.id = id;
		this.type = type;
		this.status = status;
	}
	public int getIndex(){
		return index;
	}
	public String getName(){
		return name;
	}
	public long getId(){
		return id;
	}
	public String getType(){
		return type;
	}
	public String getStatus(){
		return status;
	}
	public void set(int index,long id,String type,String status){
		this.index = index;
		this.id = id;
		this.type = type;
		this.status = status;
	}
	public void setIndex(int index){
		this.index = index;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String toString(){
		return getIndex() + " " + getId() + " " + getName() + " " + " " + getType() + " " + getStatus();
	}
	
}
