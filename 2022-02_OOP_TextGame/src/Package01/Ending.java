package Package01;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
public class Ending extends Player{
	
	int FinalScore;
	PlaceandTreename p = new PlaceandTreename();
	String tree;
	Ending(int score){
		FinalScore = score;
	}
	
	String tree() {
		if (p.place.equals("브라질")) {
			if (FinalScore >= 36)
				tree = "야자수나무";
			else if (FinalScore >=22 && FinalScore < 36)
				tree = "바오밥나무";
			else if (FinalScore < 22)
				tree = "잡종나무";
		}
		if (p.place.equals("한국")) {
			if (FinalScore >= 36)
				tree = "무궁화나무";
			else if (FinalScore >=22 && FinalScore < 36)
				tree = "벚꽃나무";
			else if (FinalScore < 22)
				tree = "소나무";
		}
		if (p.place.equals("러시아")) {
			if (FinalScore >= 36)
				tree = "단풍나무";
			else if (FinalScore >=22 && FinalScore < 36)
				tree = "자작나무";
			else if (FinalScore < 22)
				tree = "앙상한나무";
		}
		return tree;
	}

	void showFinal() {
		System.out.println("  . . .");
		Main.pause.GetPause(1000);
		System.out.println();
		System.out.println("  . . .");
		Main.pause.GetPause(1000);
		System.out.println();
		System.out.println("  . . .");
		Main.pause.GetPause(1000);
		System.out.println("최종점수는 "+ this.FinalScore+"점 입니다.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("  -%s-\n", tree());
		System.out.println();
		Main.pause.GetPause(500);
		

		if (FinalScore >= 36) {
			System.out.println(Progress.t.TreeforEnding[0]);
			Main.pause.GetPause(100);
			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다!!\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                          대상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
			System.out.println();
			System.out.println("   본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("    잘 성장시켜 훌륭한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★★★★");
			System.out.println("└───────────────────────────────┘");
		}

		else if (FinalScore >= 29 && FinalScore <= 35) {
			System.out.println(Progress.t.TreeforEnding[1]);
			Main.pause.GetPause(100);

			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다!!\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       최우수상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
			System.out.println();
			System.out.println("    본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("    잘 성장시켜 훌륭한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★★★☆");
			System.out.println("└───────────────────────────────┘");
		}

		else if (FinalScore >= 22 && FinalScore <= 28) {
			System.out.println(Progress.t.TreeforEnding[1]);
			Main.pause.GetPause(100);

			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다!\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       우수상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
			System.out.println();
			System.out.println("    본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("    잘 성장시켜 준수한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★★☆☆");
			System.out.println("└───────────────────────────────┘");
		}

		else if (FinalScore < 22) {
			System.out.println(Progress.t.TreeforEnding[2]);
			Main.pause.GetPause(100);

			System.out.printf("%s(이)가 심었던 %s(은)는 %s(이)가 되었다.....\n", Opening.p1.GetPlayerName(), p.treename, tree);
			Main.pause.GetPause(1000);

			System.out.println();
			System.out.println("┌───────────────────────────────┐");
			System.out.println(" KMU 나무 키우기 경진대회");
			System.out.println();
			System.out.println("             상   장");
			System.out.println("                       장려상     ");
			System.out.println("                       " + Opening.p1.GetPlayerName());
			System.out.println();
			System.out.println("    본 학생은 " + p.treename + "을(를) " + tree + "로");
			System.out.println();
			System.out.println("     성장시켜 그럭저럭한 결과를 얻어냈기에");
			System.out.println();
			System.out.println("          이 상장을 수여함.");
			System.out.println();
			System.out.println("                        ★★☆☆☆");
			System.out.println("└───────────────────────────────┘");
		}

		this.endingCredit();

	}

	void endingCredit() {
		try {
			
			File bgm;
			AudioInputStream stream;
			AudioFormat format;
			DataLine.Info info;
			
			bgm = new File("treesongs/end.wav");
			Clip clip;
			
			try {
				stream = AudioSystem.getAudioInputStream(bgm);
				format = stream.getFormat();
				info = new DataLine.Info(Clip.class, format);
				clip = (Clip) AudioSystem.getLine(info);
				clip.open(stream);
				clip.start();
				
			} catch (Exception e) {
				
			}
		} catch (Exception e) {

		}

		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("                역할 분배\n");
		Main.pause.GetPause(700);
		System.out.println("              기획,제작 : 호우우팀");
		Main.pause.GetPause(700);
		System.out.println("  오프닝,플레이어 정보,미니게임1,나무와의 대화 : 정호용");
		Main.pause.GetPause(700);
		System.out.println("   엔딩,나무이름 짓기, 미니게임2, 장소정하기 : 현진우");
		Main.pause.GetPause(700);
		System.out.println("     미니게임 3, 실패 엔딩 , 스코어보드 : 최우정");
		Main.pause.GetPause(700);
		System.out.println("          감  사  합  니  다 !  !  ");
		Main.pause.GetPause(700);
		System.out.println("  ░░░░░░░░█▄░▄█ █▀▀░█▀█░█▀█░█░█░░░░░░░░░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░░░░░░░█░▀░█ █▀▀░██▀░██▀░▀█▀░░░░░░░░░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░░░░░░░▀░░░▀ ▀▀▀░▀░▀░▀░▀░░▀░░░░░░░░░░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░█▀▀░█░█ █▀█░█░█▀▀░▀█▀ █▄░▄█ █▀█░█▀▀░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░█░░░█▀█ ██▀░█░▀▀█░░█░ █░▀░█ █▀█░▀▀█░░");
		Main.pause.GetPause(700);
		System.out.println("  ░░▀▀▀░▀░▀ ▀░▀░▀░▀▀▀░░▀░ ▀░░░▀ ▀░▀░▀▀▀░░");
		Main.pause.GetPause(700);
		System.out.println("└─────────────────────────────────────────┘");
		Main.pause.GetPause(2000);
		System.out.println("게임을 종료합니다.");
		System.exit(0);
	}
}