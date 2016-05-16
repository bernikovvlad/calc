package junit;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class CalcTest {

	@Test
	public void testsumNULL() {
		Calculat calc=new Calculat();
		try{
            calc.sum(null,null );
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� �������� �� NULL");
		}
	}
	
	@Test
	public void testdifferenceNULL() {
		Calculat calc=new Calculat();
		try{
            calc.sum(null,null );
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� ��������� �� NULL");
		}
	}
	
	@Test
	public void testmultiplicationNULL() {
		Calculat calc=new Calculat();
		try{
            calc.sum(null,null );
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� ��������� �� NULL");
		}
	}
	
	@Test
	public void testdivisionNULL() {
		Calculat calc=new Calculat();
		try{
            calc.sum(null,null );
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� ������� �� NULL");
		}
	}
	
	@Test
	public void testsumStr() {
		Calculat calc=new Calculat();
		try{
            calc.sum("rt", "vb");
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� �������� �� ������");
		}
	}

	
	@Test
	public void testdifferenceStr() {
		Calculat calc=new Calculat();
		try{
            calc.sum("rt", "vb");
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� ��������� �� ������");
		}
	}
	
	@Test
	public void testmultiplicationStr() {
		Calculat calc=new Calculat();
		try{
            calc.sum("rt", "vb");
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� ��������� �� ������");
		}
	}
	
	@Test
	public void testdivisionStr() {
		Calculat calc=new Calculat();
		try{
            calc.sum("rt", "vb");
		}
		catch(Exception e){
			System.out.println("������� ��������� ��� ������� �� ������");
		}
	}
	
	@Test
	public void testsum() {
		Calculat calc=new Calculat();
		Double actual=calc.sum(2, 3);
		Double expected=7.0;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testdifference() {
		Calculat calc=new Calculat();
		Double actual=calc.difference(5, 3);
		Double expected=7.0;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testmultiplication() {
		Calculat calc=new Calculat();
		Double actual=calc.multiplication(5, 3);
		Double expected=7.0;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testdivision() {
		Calculat calc=new Calculat();
		Double actual=calc.division(5, 3);
		Double expected=7.0;
		Assert.assertEquals(actual, expected);
	}

	
	@Test 
	//��� ������� �� ���� =>�������������(true)
	public void test_Divide_zero()
	{
		Calculat calc=new Calculat();
		Assert.assertEquals(Double.isInfinite(calc.division(5.0, 0)),false);

	}
	
	@Test 
	//��� �������  ���� �� ���� =>����������������(true)
	public void test_isNaN()
	{
		Calculat calc=new Calculat();
		Assert.assertEquals(Double.isNaN(calc.division(0, 0)),false);

	}
	
	@Test 
	//����������� ��� ������������
	public void testsum_zeropointone()
	{
		double s=0;
		Calculat calc=new Calculat();
		for (int i=0;i<26;i++){
			s=calc.sum(s,0.1);	
		}	
		Assert.assertEquals(s,2.6);

	}
	
	@Test 
	//����������� ��� ���������
	public void testmultiplerror()
	{
		double s=0;
		Calculat calc=new Calculat();
			s=calc.multiplication(29.0, 0.01);
			int s2=(int) (s*100);
		Assert.assertEquals(s2,29);
	}
	
	@Test 
	//����������� ��� ���������
	public void testDivideerror()
	{
		double s=0;
		Calculat calc=new Calculat();
			s=calc.difference(2.0, 1.1);	
		Assert.assertEquals(s,0.9);
	}
	
	@Test 
	//������������������ ��� ���������
	public void powerM()
	{
		Calculat calc=new Calculat();
		calc.multiplication(calc.multiplication(Math.log(555555555555555555555555.56757),Math.log(555555555555555555555555.56757)), calc.multiplication(Math.log(555555555555555555555555.56757),Math.log(555555555555555555555555.56757)));	
	}
	
	@Test 
	//������������������ ��� �������
	public void powerDel()
	{
		Calculat calc=new Calculat();
		calc.division(calc.division(Math.log(555555555555555555555555.56757),Math.log(555555555555555555555555.56757)), calc.division(Math.log(555555555555555555555555.56757),Math.log(555555555555555555555555.56757)));	
	}
	
	@Test 
	//������������������ ��� ��������� ���������
	public void powerMultitest()
	{
		Calculat calc=new Calculat();
		calc.difference(calc.multiplication(Math.log(555555555555555555555555.56757),Math.log(555555555555555555555555.56757)), calc.multiplication(Math.log(555555555555555555555555.56757),Math.log(555555555555555555555555.56757)));	
	}
}
