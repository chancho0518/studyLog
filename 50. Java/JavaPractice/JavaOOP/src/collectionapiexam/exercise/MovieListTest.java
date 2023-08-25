package collectionapiexem.exercise;

import java.util.ArrayList;

import collectionapiexem.vo.MovieVO;

public class MovieListTest {
	public static void main(String[] args) {
		// MovieVO 객체를 저장할 ArrayList 생성
		ArrayList<MovieVO> movieList = new ArrayList<MovieVO>();
		
		// MovieVO 3편의 데이터 생성 후 ArrayList에 추가
		MovieVO movie1st = new MovieVO("괴물", "봉준호", 2006, "Korea");
		MovieVO movie2nd = new MovieVO("기생충", "봉준호", 2019, "Korea");
		MovieVO movie3rd = new MovieVO("완벽한 타인", "이재규", 2018, "Korea");
		
		movieList.add(movie1st);
		movieList.add(movie2nd);
		movieList.add(movie3rd);
		
		// Table 출력
		System.out.println("+----------------+--------+-----+------+");
		System.out.println("|영화제목          |영화감독  |개봉년도|국가   |");
		System.out.println("+----------------+--------+-----+------+");
		for(MovieVO movie: movieList) {
			System.out.printf("|%-16s|%-8s|%-4d|%-6s|\n", movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getCountry());
		}
		System.out.println("+----------------+--------+-----+------+");
		
		// 검색
		String searchTitle = "기생충";
		for(MovieVO movie: movieList) {
			if(movie.getTitle().equals(searchTitle)) {
				System.out.println("영화제목: " + movie.getTitle());
				System.out.println("영화감독: " + movie.getDirector());
				System.out.println("개봉년도: " + movie.getYear());
				System.out.println("개봉국가: " + movie.getCountry());
				
				break;
			}
		}
			
	}
}
