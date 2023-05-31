package prac;

public class KakaoMbti {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int[] arr1 = {0,0};
        int[] arr2 = {0,0};
        int[] arr3 = {0,0};
        int[] arr4 = {0,0};
        
        
        for(int i = 0; i < survey.length; i++) {
        	if(choices[i] <= 4) {
        		if(survey[i].charAt(0) == 'R') arr1[0] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'T') arr1[1] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'C') arr2[0] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'F') arr2[1] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'J') arr3[0] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'M') arr3[1] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'A') arr4[0] += 4 - choices[i];
        		else if(survey[i].charAt(0) == 'N') arr4[1] += 4 - choices[i];
        	} else if(choices[i] > 4) {
        		
        	}
        }
        
        
        
        
        
        
        
        
        return answer;
    }

}
