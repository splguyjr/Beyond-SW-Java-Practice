package com.splguyjr.chap16.problem4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application4 {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("인셉션", "액션", 8.8, 148),
                new Movie("다크 나이트", "액션", 9.0, 152),
                new Movie("인터스텔라", "SF", 8.6, 169),
                new Movie("대부", "드라마", 9.2, 175),
                new Movie("쇼생크 탈출", "드라마", 9.3, 142)
        );

        // 1. 특정 장르(액션)의 영화 중 평점이 8 이상인 영화의 제목 리스트를 반환
        List<String> highRatedActionMovies = movies.stream()
                .filter(m1 -> m1.getGenre().equals("액션"))
                .filter(m1 -> m1.getRating() > 8.0)
                .map(Movie::getTitle)
                .toList();

        // 2. 모든 영화의 평균 상영시간을 계산하여 반환
        double averageDuration = movies.stream()
                .mapToDouble(Movie::getDuration)
                .average()
                .getAsDouble();

        // 3. 각 장르별 최고 평점을 가진 영화의 제목을 맵으로 반환
        /* 잘 모르겠음 다시 보기 */

        Map<String, String> topRatedMoviesByGenre = movies
                .stream()
                .collect(
                        Collectors.groupingBy(
                                    Movie::getGenre,
                                    Collectors.collectingAndThen(
                                            Collectors.maxBy(Comparator.comparingDouble(Movie::getRating)),
                                            m -> m.map(Movie::getTitle).orElse(null)
                                    )
                    )
                );





    /* 최고 평균점수를 따로 추출하고 구하는 로직으로 가다가 폐기처분 */
//        Double highestAvgRating = movies
//                .stream()
//                .collect(Collectors
//                        .groupingBy(
//                                Movie::getGenre,
//                                Collectors.summingDouble(Movie::getRating)
//                        )
//                ).entrySet()
//                .stream()
//                .max(Comparator.comparingDouble(Map.Entry::getValue))
//                .map(Map.Entry::getValue)
//                .get();
//
//        Map<String, String> topRatedMoviesByGenre = movies
//                .stream()
//                .filter(m1 -> m1.getRating() == highestAvgRating)
//                .collect(Collectors.toMap(Movie::getGenre, Movie::getTitle));


        System.out.println(highRatedActionMovies); // 출력 예시: ["인셉션", "다크 나이트"]
        System.out.println(averageDuration); // 출력 예시: 157.2
        System.out.println(topRatedMoviesByGenre); // 출력 예시: {액션=다크 나이트, SF=인터스텔라, 드라마=쇼생크 탈출}
    }
}
