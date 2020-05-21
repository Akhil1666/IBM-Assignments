package comm.example.bean;

import lombok.Setter;

@Setter
public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice backvolley today.!";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
