package com.sist.string;
/*
 *   replace : º¯È¯
 *     String s="Hello"
 *     s.replace('l', 'k');  => Hekko
 *               old  new
 *   replaceAll
 *   trim
 *   valueOf
 *   length
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Hello Java";
		// º¯È¯µÈ ¹®ÀÚ¿­ ¹Þ±â
		String s=data.replace('l', 'k');
		System.out.println(s);
		s=data.replace("Java", "Kotlin"); // ¹®ÀÚ¿­ ÀüÃ¼ º¯°æ - ¿À¹ö·Îµù
		System.out.println(s);
		int rank=(int)(Math.random()*500)+1;
		String data2=rank+"ÁÁÀº »ç¶÷ ÀÖÀ¸¸é ¼Ò°³½ÃÄÑÁà";
//		System.out.println(data2);
		// µî¼ö - ³ë·¡Á¦¸ñ ºÐ¸®
		String num=data2.replaceAll("[^0-9]", ""); // ¼ýÀÚ¸¦ Á¦¿ÜÇÏ°í ³ª¸ÓÁö´Â °ø¹é
		String title=data2.replaceAll("[^°¡-ÆR]", "");
		System.out.println("Rank:"+num);
		System.out.println("Title:"+title);
		
		// trim() => ÁÂ¿ìÀÇ °ø¹éÀ» Á¦°Å : »ç¿ëÀÚ ÀÔ·Â°ª => È¸¿ø°¡ÀÔ, ·Î±×ÀÎ, ¾ÆÀÌµðÃ¼Å©, ºñ¹Ð¹øÈ£... => ¿À¶óÅ¬¿¡ ÀúÀå
		String data3=" Hello Java ";
		System.out.println("°ø¹é Á¦°Å Àü ±æÀÌ : "+data3.length());
		System.out.println(data3);
		String s2=data3.trim(); //trim - ÁÂ¿ìÀÇ °ø¹é Á¦°Å => but. Áß°£¿¡ ÀÖ´Â °ø¹éÀº Á¦°Å ÇÒ ¼ö ¾ø´Ù
		System.out.println("°ø¹é Á¦°Å ÈÄ ±æÀÌ : "+s2.length());
		System.out.println(s2);
		
		// valueOf() ¹®ÀÚ¿­·Î º¯°æ
		// valueOf() => static => String.valueOf()
		// String.valueOf(true) => "true"
		// String.valueOf(10.5) => "10.5"
		// ¸ðµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯È¯ ==> À©µµ¿ì, À¥ (¿À¶óÅ¬)
	}

}
