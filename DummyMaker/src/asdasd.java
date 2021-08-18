import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class asdasd {

	public static void main(String[] args) {

		Random rnd = new Random();

		String[] nick1 = { "기분나쁜", "기분좋은", "신바람나는", "상쾌한", "짜릿한", "그리운", "자유로운", "서운한", "울적한", "비참한", "위축되는", "긴장되는",
				"두려운", "당당한", "배부른", "수줍은", "창피한", "멋있는", "열받은", "심심한", "잘생긴", "이쁜", "시끄러운" };

		String[] nick2 = { "사자", "코끼리", "호랑이", "곰", "여우", "늑대", "너구리", "침팬치", "고릴라", "참새", "고슴도치", "강아지", "고양이", "거북이",
				"토끼", "앵무새", "하이에나", "돼지", "하마", "원숭이", "물소", "얼룩말", "치타", "악어", "기린", "수달", "염소", "다람쥐", "판다" };

		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < nick1.length; i++) {

			for (int j = 0; j < nick2.length; j++) {

				map.put(nick1[rnd.nextInt(nick1.length)] + nick2[rnd.nextInt(nick2.length)],
						nick1[rnd.nextInt(nick1.length)] + nick2[rnd.nextInt(nick2.length)]);

			}

		}

		Iterator<String> it = map.keySet().iterator();

		String[] nickname = { "열받은다람쥐", "신바람나는호랑이", "기분좋은호랑이", "서운한원숭이", "비참한고슴도치", "창피한기린", "시끄러운원숭이", "창피한하마",
				"잘생긴물소", "서운한토끼", "잘생긴판다", "두려운얼룩말", "수줍은물소", "비참한고슴도치", "창피한고슴도치", "멋있는사자", "짜릿한판다", "잘생긴하마", "멋있는너구리",
				"짜릿한호랑이", "기분나쁜기린", "이쁜앵무새", "울적한침팬치", "기분나쁜원숭이", "긴장되는여우", "기분좋은호랑이", "이쁜판다", "긴장되는돼지", "시끄러운거북이",
				"멋있는악어", "시끄러운침팬치", "그리운돼지", "심심한고슴도치", "비참한기린", "그리운수달", "수줍은거북이", "심심한늑대", "울적한악어", "짜릿한거북이", "짜릿한여우",
				"이쁜사자", "두려운기린", "수줍은코끼리", "시끄러운곰", "그리운침팬치", "심심한기린", "서운한악어", "멋있는돼지", "자유로운다람쥐", "잘생긴돼지", "심심한염소",
				"기분나쁜여우", "짜릿한악어", "서운한하마", "멋있는늑대", "위축되는거북이", "그리운곰", "짜릿한침팬치", "그리운강아지", "두려운얼룩말", "당당한강아지", "비참한수달",
				"시끄러운강아지", "울적한원숭이", "창피한판다", "긴장되는거북이", "울적한참새", "멋있는기린", "서운한고양이", "이쁜늑대", "시끄러운너구리", "그리운고슴도치",
				"신바람나는침팬치", "수줍은너구리", "멋있는곰", "멋있는수달", "긴장되는다람쥐", "심심한하마", "긴장되는너구리", "잘생긴여우", "기분좋은원숭이", "긴장되는수달",
				"심심한고릴라", "멋있는여우", "긴장되는고릴라", "창피한수달", "긴장되는고릴라", "긴장되는수달", "수줍은판다", "수줍은고릴라", "멋있는돼지", "비참한물소",
				"멋있는기린", "긴장되는수달", "두려운늑대", "두려운고릴라", "긴장되는참새", "긴장되는얼룩말", "당당한염소", "신바람나는여우", "두려운치타", "짜릿한수달", "두려운곰",
				"상쾌한얼룩말", "두려운기린", "기분나쁜앵무새", "울적한하마", "위축되는늑대", "상쾌한고슴도치", "자유로운침팬치", "울적한돼지", "그리운여우", "당당한판다",
				"잘생긴돼지", "수줍은돼지", "심심한치타", "배부른사자", "긴장되는호랑이", "배부른고양이", "멋있는물소", "수줍은사자", "긴장되는악어", "자유로운치타", "배부른돼지",
				"배부른다람쥐", "울적한물소", "신바람나는너구리", "기분좋은물소", "기분좋은강아지", "수줍은기린", "짜릿한판다", "위축되는다람쥐", "당당한기린", "긴장되는기린",
				"울적한돼지", "두려운코끼리", "울적한앵무새", "위축되는하이에나", "울적한치타", "배부른침팬치", "기분좋은침팬치", "신바람나는돼지", "배부른참새", "수줍은고양이",
				"신바람나는치타", "수줍은강아지", "잘생긴거북이", "잘생긴악어", "멋있는거북이", "그리운하마", "그리운수달", "심심한토끼", "서운한원숭이", "그리운다람쥐",
				"두려운호랑이", "상쾌한하이에나", "자유로운염소", "시끄러운거북이", "위축되는수달", "신바람나는판다", "그리운돼지", "창피한악어", "상쾌한원숭이", "시끄러운치타",
				"수줍은치타", "당당한너구리", "긴장되는돼지", "그리운호랑이", "울적한강아지", "당당한너구리", "상쾌한하이에나", "수줍은곰", "울적한염소", "시끄러운고양이",
				"위축되는참새", "두려운늑대", "울적한거북이", "긴장되는여우", "심심한돼지", "기분나쁜얼룩말", "울적한늑대", "긴장되는곰", "두려운악어", "잘생긴판다", "잘생긴돼지",
				"배부른여우", "짜릿한다람쥐", "신바람나는치타", "비참한하이에나", "이쁜강아지", "비참한고슴도치", "비참한판다", "멋있는호랑이", "수줍은사자", "비참한곰", "이쁜염소",
				"그리운너구리", "심심한고양이", "심심한앵무새", "열받은다람쥐", "두려운너구리", "두려운거북이", "신바람나는너구리", "그리운원숭이", "위축되는원숭이", "울적한기린",
				"신바람나는하이에나", "상쾌한사자", "그리운악어", "잘생긴토끼", "비참한고슴도치", "잘생긴토끼", "당당한기린", "비참한고양이", "심심한판다", "수줍은수달",
				"창피한사자", "자유로운고릴라", "시끄러운하이에나", "열받은참새", "기분좋은침팬치", "심심한코끼리", "짜릿한참새", "기분좋은수달", "신바람나는고릴라", "긴장되는토끼",
				"기분좋은늑대", "위축되는토끼", "잘생긴앵무새", "신바람나는원숭이", "수줍은판다", "위축되는얼룩말", "서운한앵무새", "두려운얼룩말", "위축되는판다", "기분좋은거북이",
				"위축되는고릴라", "신바람나는참새", "잘생긴원숭이", "비참한참새", "비참한다람쥐", "울적한코끼리", "기분좋은호랑이", "당당한침팬치", "수줍은원숭이", "서운한하이에나",
				"창피한곰", "당당한하이에나", "배부른판다", "배부른판다", "기분좋은고양이", "열받은고슴도치", "상쾌한판다", "기분좋은얼룩말", "시끄러운염소", "자유로운물소",
				"심심한원숭이", "짜릿한얼룩말", "비참한고릴라", "이쁜곰", "자유로운염소", "심심한늑대", "신바람나는코끼리", "창피한돼지", "짜릿한고양이", "열받은하마", "비참한여우",
				"기분좋은사자", "위축되는호랑이", "심심한원숭이", "시끄러운치타", "시끄러운앵무새", "당당한너구리", "긴장되는원숭이", "상쾌한여우", "열받은곰", "기분좋은앵무새",
				"기분나쁜고슴도치", "멋있는참새", "두려운염소", "자유로운원숭이", "수줍은돼지", "서운한침팬치", "울적한치타", "창피한수달", "위축되는침팬치", "기분나쁜하마",
				"심심한얼룩말", "잘생긴토끼", "짜릿한코끼리", "상쾌한고양이", "신바람나는곰", "위축되는토끼", "기분나쁜얼룩말", "위축되는침팬치", "짜릿한참새", "서운한호랑이",
				"심심한원숭이", "수줍은너구리", "울적한다람쥐", "긴장되는참새", "위축되는침팬치", "수줍은하이에나", "당당한호랑이", "서운한강아지", "멋있는얼룩말", "신바람나는앵무새",
				"긴장되는코끼리", "기분나쁜치타", "기분좋은판다", "이쁜참새", "기분좋은기린", "수줍은염소", "시끄러운늑대", "잘생긴늑대", "시끄러운다람쥐", "잘생긴고릴라",
				"울적한침팬치", "심심한하마", "긴장되는얼룩말", "두려운늑대", "두려운돼지", "긴장되는거북이", "기분좋은돼지", "심심한기린", "서운한수달", "자유로운여우",
				"짜릿한고슴도치", "두려운호랑이", "그리운고릴라", "울적한고슴도치", "당당한코끼리", "자유로운하이에나", "위축되는하이에나", "심심한돼지", "긴장되는늑대", "당당한침팬치",
				"배부른물소", "이쁜판다", "비참한고슴도치", "자유로운토끼", "이쁜얼룩말", "멋있는늑대", "열받은여우", "울적한판다", "비참한호랑이", "신바람나는고양이",
				"창피한호랑이", "그리운고슴도치", "이쁜염소", "울적한다람쥐", "비참한강아지", "시끄러운기린", "당당한늑대", "배부른돼지", "기분좋은호랑이", "당당한코끼리",
				"짜릿한토끼", "잘생긴수달", "심심한너구리", "그리운얼룩말", "시끄러운하마", "시끄러운고릴라", "당당한물소", "창피한판다", "당당한고릴라", "울적한하이에나",
				"긴장되는침팬치", "그리운하이에나", "멋있는수달", "시끄러운돼지", "기분나쁜얼룩말", "긴장되는곰", "배부른사자", "울적한돼지", "수줍은앵무새", "이쁜침팬치",
				"위축되는고양이", "자유로운수달", "기분나쁜얼룩말", "이쁜돼지", "당당한고릴라", "비참한기린", "당당한코끼리", "두려운염소", "멋있는다람쥐", "서운한참새",
				"위축되는악어", "자유로운늑대", "기분좋은염소", "짜릿한돼지", "위축되는고양이", "창피한여우", "짜릿한곰", "열받은수달", "두려운강아지", "시끄러운참새", "서운한치타",
				"상쾌한침팬치", "서운한늑대", "짜릿한얼룩말", "배부른원숭이", "잘생긴토끼", "짜릿한여우", "기분나쁜염소", "위축되는판다", "당당한악어", "심심한늑대", "긴장되는토끼",
				"그리운코끼리", "상쾌한수달", "자유로운코끼리", "그리운여우", "수줍은하마", "서운한악어", "멋있는판다", "두려운염소", "두려운수달", "두려운토끼", "신바람나는늑대",
				"상쾌한참새" };

		for (int i = 0; i < nickname.length; i++) {

			if (nickname[i].length() <= 6) {
				System.out.print("\"" + nickname[i] + "\",");
			}

		}

		String[] size = { "열받은다람쥐", "서운한원숭이", "창피한기린", "창피한하마", "잘생긴물소", "서운한토끼", "잘생긴판다", "두려운얼룩말", "수줍은물소", "멋있는사자",
				"짜릿한판다", "잘생긴하마", "멋있는너구리", "짜릿한호랑이", "기분나쁜기린", "이쁜앵무새", "울적한침팬치", "긴장되는여우", "이쁜판다", "긴장되는돼지", "멋있는악어",
				"그리운돼지", "비참한기린", "그리운수달", "수줍은거북이", "심심한늑대", "울적한악어", "짜릿한거북이", "짜릿한여우", "이쁜사자", "두려운기린", "수줍은코끼리",
				"시끄러운곰", "그리운침팬치", "심심한기린", "서운한악어", "멋있는돼지", "잘생긴돼지", "심심한염소", "기분나쁜여우", "짜릿한악어", "서운한하마", "멋있는늑대",
				"그리운곰", "짜릿한침팬치", "그리운강아지", "두려운얼룩말", "당당한강아지", "비참한수달", "울적한원숭이", "창피한판다", "울적한참새", "멋있는기린", "서운한고양이",
				"이쁜늑대", "수줍은너구리", "멋있는곰", "멋있는수달", "심심한하마", "잘생긴여우", "긴장되는수달", "심심한고릴라", "멋있는여우", "창피한수달", "긴장되는수달",
				"수줍은판다", "수줍은고릴라", "멋있는돼지", "비참한물소", "멋있는기린", "긴장되는수달", "두려운늑대", "두려운고릴라", "긴장되는참새", "당당한염소", "두려운치타",
				"짜릿한수달", "두려운곰", "상쾌한얼룩말", "두려운기린", "울적한하마", "위축되는늑대", "울적한돼지", "그리운여우", "당당한판다", "잘생긴돼지", "수줍은돼지",
				"심심한치타", "배부른사자", "배부른고양이", "멋있는물소", "수줍은사자", "긴장되는악어", "자유로운치타", "배부른돼지", "배부른다람쥐", "울적한물소", "기분좋은물소",
				"수줍은기린", "짜릿한판다", "당당한기린", "긴장되는기린", "울적한돼지", "두려운코끼리", "울적한앵무새", "울적한치타", "배부른침팬치", "배부른참새", "수줍은고양이",
				"수줍은강아지", "잘생긴거북이", "잘생긴악어", "멋있는거북이", "그리운하마", "그리운수달", "심심한토끼", "서운한원숭이", "그리운다람쥐", "두려운호랑이",
				"자유로운염소", "위축되는수달", "그리운돼지", "창피한악어", "상쾌한원숭이", "시끄러운치타", "수줍은치타", "당당한너구리", "긴장되는돼지", "그리운호랑이",
				"울적한강아지", "당당한너구리", "수줍은곰", "울적한염소", "위축되는참새", "두려운늑대", "울적한거북이", "긴장되는여우", "심심한돼지", "울적한늑대", "긴장되는곰",
				"두려운악어", "잘생긴판다", "잘생긴돼지", "배부른여우", "짜릿한다람쥐", "이쁜강아지", "비참한판다", "멋있는호랑이", "수줍은사자", "비참한곰", "이쁜염소",
				"그리운너구리", "심심한고양이", "심심한앵무새", "열받은다람쥐", "두려운너구리", "두려운거북이", "그리운원숭이", "울적한기린", "상쾌한사자", "그리운악어",
				"잘생긴토끼", "잘생긴토끼", "당당한기린", "비참한고양이", "심심한판다", "수줍은수달", "창피한사자", "열받은참새", "심심한코끼리", "짜릿한참새", "기분좋은수달",
				"긴장되는토끼", "기분좋은늑대", "위축되는토끼", "잘생긴앵무새", "수줍은판다", "서운한앵무새", "두려운얼룩말", "위축되는판다", "잘생긴원숭이", "비참한참새",
				"비참한다람쥐", "울적한코끼리", "당당한침팬치", "수줍은원숭이", "창피한곰", "배부른판다", "배부른판다", "상쾌한판다", "시끄러운염소", "자유로운물소", "심심한원숭이",
				"짜릿한얼룩말", "비참한고릴라", "이쁜곰", "자유로운염소", "심심한늑대", "창피한돼지", "짜릿한고양이", "열받은하마", "비참한여우", "기분좋은사자", "심심한원숭이",
				"시끄러운치타", "당당한너구리", "상쾌한여우", "열받은곰", "멋있는참새", "두려운염소", "수줍은돼지", "서운한침팬치", "울적한치타", "창피한수달", "기분나쁜하마",
				"심심한얼룩말", "잘생긴토끼", "짜릿한코끼리", "상쾌한고양이", "신바람나는곰", "위축되는토끼", "짜릿한참새", "서운한호랑이", "심심한원숭이", "수줍은너구리",
				"울적한다람쥐", "긴장되는참새", "당당한호랑이", "서운한강아지", "멋있는얼룩말", "기분나쁜치타", "기분좋은판다", "이쁜참새", "기분좋은기린", "수줍은염소",
				"시끄러운늑대", "잘생긴늑대", "잘생긴고릴라", "울적한침팬치", "심심한하마", "두려운늑대", "두려운돼지", "기분좋은돼지", "심심한기린", "서운한수달", "자유로운여우",
				"두려운호랑이", "그리운고릴라", "당당한코끼리", "심심한돼지", "긴장되는늑대", "당당한침팬치", "배부른물소", "이쁜판다", "자유로운토끼", "이쁜얼룩말", "멋있는늑대",
				"열받은여우", "울적한판다", "비참한호랑이", "창피한호랑이", "이쁜염소", "울적한다람쥐", "비참한강아지", "시끄러운기린", "당당한늑대", "배부른돼지", "당당한코끼리",
				"짜릿한토끼", "잘생긴수달", "심심한너구리", "그리운얼룩말", "시끄러운하마", "당당한물소", "창피한판다", "당당한고릴라", "멋있는수달", "시끄러운돼지", "긴장되는곰",
				"배부른사자", "울적한돼지", "수줍은앵무새", "이쁜침팬치", "자유로운수달", "이쁜돼지", "당당한고릴라", "비참한기린", "당당한코끼리", "두려운염소", "멋있는다람쥐",
				"서운한참새", "위축되는악어", "자유로운늑대", "기분좋은염소", "짜릿한돼지", "창피한여우", "짜릿한곰", "열받은수달", "두려운강아지", "시끄러운참새", "서운한치타",
				"상쾌한침팬치", "서운한늑대", "짜릿한얼룩말", "배부른원숭이", "잘생긴토끼", "짜릿한여우", "기분나쁜염소", "위축되는판다", "당당한악어", "심심한늑대", "긴장되는토끼",
				"그리운코끼리", "상쾌한수달", "그리운여우", "수줍은하마", "서운한악어", "멋있는판다", "두려운염소", "두려운수달", "두려운토끼", "상쾌한참새" };

		System.out.println(size.length);

	}

}
