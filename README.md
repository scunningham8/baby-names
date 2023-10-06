# Baby Name Analyzer

Every year, The US Social Security Administration releases data regarding the most popular baby names of that year. Included in the dataset are the names given to newborn babies, the sex of the babies who were given that name, and the number of babies who were given that name. The data is sorted by the number of babies given a specific name, such that the most frequently given names appear first in the list. The list reports all female names first, followed by the male names.

## Your Task

This project turns the data into something that people can easily query and explore.

The program:

-   asks users which baby name they'd like to know more about and the sex of the babies with that name
-   finds all of the years where that name was listed as popular and record that information
    -   records the year
    -   records the count of babies given that name in that year
    -   records the "popularity ranking". The most popular name for a given sex in a given year should be `1`, the second-most popular name should be `2`, etc.
-   reports to the user statistics about the first year that name was popular
-   finds and report to the user statistics about the year where the name was the most popular (the year with the lowest popularity ranking). In the case that several years tie for the lowest popularity ranking, choose the year with the highest count of babies. If both the popularity and the count are the same, choose the year that occurred first
-   finds and report to the user statistics about the year where the name was given to the most babies (the year with the highest baby count). In the case that several years tie for the highest baby count, choose the year with the lowest popularity ranking. If both the popularity and the count are the same, choose the year that occurred first
-   finds and report to the user the number of years that name has been popular
-   finds and report to the user the total number of babies in the US that have been given that name
-   has unit tests for all functions that perform calculations (including the function that reads one file).

## Standards the program meets

- **Functions**: Appropriately splits code into functions according to the single responsibility principle, correctly utilizing parameters and return values.
- **Input/Output**: Demonstrates knowledge of file input and output, working with buffers, and understands potential efficiency concerns.
- **Code Mechanics**: Chooses appropriate data types and structures, uses those types and structures effectively, and continues to make good choices over time.
- **Code Style**: Code written in an industry-standard coding style.
- **Software Engineering Skills**: Software produced by following industry-standard practices, including code reading, use of remote repositories, and software testing.

### A Note About Ties:

Ties in rankings are allowed - for example, all names with a count of 10 babies have the same popularity ranking.

As an example example, if a year had the following data:

    John,M,800
    Martin,M,500
    Julio,M,500
    Sean,M,150

...then John would have a popularity of 1, Martin and Julio would have a popularity of 2, and Sean would have a popularity of 3 (notice that Sean does not have a popularity of 4).

## Examples

Here is an example of program output for the name Val among female babies:

    Welcome to the Baby Name Genie!
    I can tell you information about the history of first names across three centuries!
    What first name would you like to learn more about? Val
    Which sex would you like statistics for? (F for female, M for male): F
    Okay! Let me see what I can find about female babies named "Val".

    ..
    ....
    ...
    ....
    ...

    Okay, here's what I found:
    * Val first appeared as a popular female first name in 1908, at which time
      it was ranked 373rd. There were 9 female babies named Val that year.
    * Val reached peak popularity in 1908, at  which time it was ranked 373rd.
      There were 9 female babies named Val that year.
    * The name Val was given to the most babies in 1958 (110 female babies were
      named Val in 1958). Val was the 656th most popular female name that year.
    * Of the 67 years that Val has been a popular female name, 1,731 female
      babies have been named Val and its average popularity has been 630th.
    Full information about the years when Val was popular as a female name:
      1908 - Val was ranked 373rd for female babies (9 babies given that name)
      1911 - Val was ranked 411th for female babies (5 babies given that name)
      1912 - Val was ranked 467th for female babies (5 babies given that name)
      1913 - Val was ranked 479th for female babies (6 babies given that name)
      1914 - Val was ranked 510th for female babies (6 babies given that name)
      1915 - Val was ranked 551st for female babies (14 babies given that name)
      1916 - Val was ranked 573rd for female babies (5 babies given that name)
      1917 - Val was ranked 571st for female babies (11 babies given that name)
      1918 - Val was ranked 590th for female babies (6 babies given that name)
      1919 - Val was ranked 588th for female babies (11 babies given that name)
      1920 - Val was ranked 597th for female babies (15 babies given that name)
      1921 - Val was ranked 600th for female babies (9 babies given that name)
      1922 - Val was ranked 593rd for female babies (8 babies given that name)
      1923 - Val was ranked 601st for female babies (11 babies given that name)
      1924 - Val was ranked 605th for female babies (9 babies given that name)
      1925 - Val was ranked 601st for female babies (14 babies given that name)
      1926 - Val was ranked 599th for female babies (11 babies given that name)
      1927 - Val was ranked 606th for female babies (7 babies given that name)
      1928 - Val was ranked 603rd for female babies (5 babies given that name)
      1929 - Val was ranked 575th for female babies (22 babies given that name)
      1930 - Val was ranked 580th for female babies (11 babies given that name)
      1931 - Val was ranked 567th for female babies (16 babies given that name)
      1932 - Val was ranked 567th for female babies (22 babies given that name)
      1933 - Val was ranked 559th for female babies (18 babies given that name)
      1934 - Val was ranked 567th for female babies (7 babies given that name)
      1935 - Val was ranked 567th for female babies (14 babies given that name)
      1936 - Val was ranked 546th for female babies (25 babies given that name)
      1937 - Val was ranked 573rd for female babies (20 babies given that name)
      1938 - Val was ranked 571st for female babies (19 babies given that name)
      1939 - Val was ranked 571st for female babies (15 babies given that name)
      1940 - Val was ranked 578th for female babies (19 babies given that name)
      1941 - Val was ranked 595th for female babies (8 babies given that name)
      1942 - Val was ranked 606th for female babies (26 babies given that name)
      1943 - Val was ranked 618th for female babies (16 babies given that name)
      1944 - Val was ranked 615th for female babies (16 babies given that name)
      1945 - Val was ranked 591st for female babies (21 babies given that name)
      1946 - Val was ranked 641st for female babies (19 babies given that name)
      1947 - Val was ranked 663rd for female babies (24 babies given that name)
      1948 - Val was ranked 664th for female babies (24 babies given that name)
      1949 - Val was ranked 654th for female babies (25 babies given that name)
      1950 - Val was ranked 644th for female babies (36 babies given that name)
      1951 - Val was ranked 660th for female babies (39 babies given that name)
      1952 - Val was ranked 651st for female babies (48 babies given that name)
      1953 - Val was ranked 650th for female babies (59 babies given that name)
      1954 - Val was ranked 654th for female babies (69 babies given that name)
      1955 - Val was ranked 664th for female babies (73 babies given that name)
      1956 - Val was ranked 671st for female babies (85 babies given that name)
      1957 - Val was ranked 681st for female babies (91 babies given that name)
      1958 - Val was ranked 656th for female babies (110 babies given that name)
      1959 - Val was ranked 683rd for female babies (93 babies given that name)
      1960 - Val was ranked 704th for female babies (75 babies given that name)
      1961 - Val was ranked 685th for female babies (96 babies given that name)
      1962 - Val was ranked 714th for female babies (59 babies given that name)
      1963 - Val was ranked 732nd for female babies (59 babies given that name)
      1964 - Val was ranked 743rd for female babies (37 babies given that name)
      1965 - Val was ranked 744th for female babies (24 babies given that name)
      1966 - Val was ranked 726th for female babies (19 babies given that name)
      1967 - Val was ranked 740th for female babies (16 babies given that name)
      1968 - Val was ranked 738th for female babies (17 babies given that name)
      1969 - Val was ranked 750th for female babies (13 babies given that name)
      1970 - Val was ranked 776th for female babies (11 babies given that name)
      1971 - Val was ranked 763rd for female babies (11 babies given that name)
      1972 - Val was ranked 747th for female babies (12 babies given that name)
      1973 - Val was ranked 737th for female babies (9 babies given that name)
      1976 - Val was ranked 747th for female babies (5 babies given that name)
      1980 - Val was ranked 799th for female babies (6 babies given that name)
      1985 - Val was ranked 801st for female babies (5 babies given that name)
