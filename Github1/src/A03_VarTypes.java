public class A03_VarTypes {
	
	public static void main(String[] args) {
		
		/*
		   # ���� Ÿ��
		     -byte   (1byte)
		     
		      1byte -> 8bit
		      
		      0000 0000 (0) ~ 1111 1111 (255)
		      
		      * ù ��° bit�� ��ȣ ��Ʈ�� ���ȴ�
		      
		      byteŸ���� ��� ���� 0000 0000 (0) ~ 0111 1111 (127)
		      byteŸ���� ���� ���� 1000 0000 (-128) ~ 1111 1111 (-1)    ->���� ������ 0��1�� ��ȣ�� ��Ÿ����
		      
		      
		     -short  (2byte, signed)
		     
		      2byte -> 16bit
		      2 ^ 16 - 65536����
		      
		      short�� ��� ���� 0 ~ 32767
		      short�� ���� ���� -32768 ~ -1 
		     
		     -char   (2byte, unsigned) 
		     
		      ��ȣ�� ���� ������ 0~65535�� ����� ������ �� �ִ� Ÿ��
		      �ַ� ���� �ڵ带 �����ϴµ��� ����Ѵ� (���� Ÿ��)
		     
		     
	         -int    (4byte)
	         
	           4byte -> 32bit
	           2 ^ 32 - 4,294,967,296����
	         -long   (8byte)
		   
		       8byte -> 64bit
	    */
		byte maxByte = 127;
		byte minByte = -128;
		
		System.out.println("byte Ÿ�Կ� ������ �� �ִ� ���� ū ����"+ maxByte + "�̰�,"
				+"���� ���� ����" + minByte + "�Դϴ�.");
		
		short b = 10;
		
		short maxshort = 32767;
		short minshort = -32768;
		
		System.out.println("short Ÿ�Կ� ������ �� �ִ� ���� ū ����"+ maxshort + "�̰�,"
				+"���� ���� ����" + minshort + "�Դϴ�.");
		
		char maxchar = 65535;
		char minchar = 0;
		
		char ch = 65;
		
		System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�." + ch);
		System.out.println("char Ÿ�Կ� ����� �ڵ尪�� Ȯ���ϰ� ������ (int)�� ���δ�."+ (int)ch);
		System.out.println("char Ÿ�Կ� ������ �� �ִ� ���� ū ����"+ (int)maxchar + "�̰�,"
				+"���� ���� ����" + (int)minchar + "�Դϴ�.");
		
		int d = 10;
		
		int maxint = 2147483647;
		int minint = -2147483648;
		
		System.out.println("int Ÿ�Կ� ������ �� �ִ� ���� ū ����"+ maxint + "�̰�,"
				+"���� ���� ����" + minint + "�Դϴ�.");
		
		
		// ����
		
	    
	    
	    // int�� ������ �Ѿ�� ���ڸ� ����� ���� L�� �ٿ��� �Ѵ� (�׳� ���ڸ� ���� ���� int)
	    long _long = 2_147_483_648L;
		
		
		
		/*
		   # �Ǽ� Ÿ��
		   
		    - float  (4byte)
		    - double (8byte)
		    
		    �Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�.
		    �ε��Ҽ��� ����� ����Ѵ�.
		    */
	    
	    // �׳� �Ҽ��� ���� ���� �⺻������ doubleŸ���̴�.
	    // float Ÿ���� �Ҽ��� �ڿ� F�� �ٿ��� �Ѵ�.
	    float weight = 65.66F;
	    double height = 177.77;
	    
	    
		   /*
		   # boolean Ÿ��
		   
		      ���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
		      ���� true�� false�ۿ� ����.
		   */
		   boolean hasFood = true;
		   boolean over130cm = false;
	    
	    /*   
	    #������ Ÿ�� (Ŭ���� Ÿ��)
	    
	    ������ Ÿ���� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� �����Ѵ�.
	    
	    - String : ���ڿ�
	    - �� �� ��� Ŭ������ ..
		     
		*/
		String helloMessage = "hello, My name is John Doe.";
		String byeMessage = "Good bye.";
		
		System.out.println(helloMessage);
		System.out.println("helloMessage");
		
		System.out.println(byeMessage+byeMessage+byeMessage);
		
		
		
	}

}