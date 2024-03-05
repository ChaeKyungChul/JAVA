package sec04;

public class ResourceExam {

	public static void main(String[] args) {
			
		try(ResourceOpenClose res = new ResourceOpenClose("A")){ 
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try(ResourceOpenClose res = new ResourceOpenClose("B")){ 
			String data = res.read2();
			
			//NuberFormatException ¹Ù»ý
			int value = Integer.parseInt(data);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println();
		
		ResourceOpenClose res1 = new ResourceOpenClose("A");
		ResourceOpenClose res2 = new ResourceOpenClose("B");

		try(res1; res2){
		    String data1 = res1.read1();
		    String data2 = res2.read2();
		}catch(Exception e) {
		    e.printStackTrace();
		}
	}

}
