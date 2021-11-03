package com.ananta.movies.movies.utils

import com.ananta.movies.movies.data.MovieEntity
import com.ananta.movies.movies.data.TvShowEntity

object DataDummy {

    fun generateDummyMovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                "mv1",
                "Shang-Chi and the Legend of Ten Rings",
                "Shang-Chi and the Legend of the Ten Rings is a 2021 American superhero film based on Marvel Comics featuring the character Shang-Chi. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 25th film in the Marvel Cinematic Universe (MCU). The film was directed by Destin Daniel Cretton, from a screenplay he wrote with Dave Callaham and Andrew Lanham, and stars Simu Liu as Shang-Chi alongside Awkwafina, Meng'er Zhang, Fala Chen, Florian Munteanu, Benedict Wong, Michelle Yeoh, Ben Kingsley, and Tony Leung. In the film, Shang-Chi is forced to confront his past when his father Wenwu (Leung), the leader of the Ten Rings organization, draws Shang-Chi and his sister Xialing (Zhang) into a search for a mythical village.",
                "https://geek-network.com/wp-content/uploads/2021/07/Shang-Chi-and-The-Legend-of-The-Ten-Rings-Featured-IMage-1024x576.jpg",
                "Destin Daniel Cretton",
                "Marvel Studios",
                "$500-200 million",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt9376612/"
            )
        )

        movies.add(
            MovieEntity(
                "mv2",
                "Antlers",
                "Antlers is a 2021 supernatural horror film directed by Scott Cooper. It follows a school teacher and her police officer brother in a small Oregon town, where they become convinced one of her students is harboring a supernatural creature. The film stars Keri Russell, Jesse Plemons, Jeremy T. Thomas, Graham Greene, Scott Haze, Rory Cochrane, and Amy Madigan. The screenplay, written by C. Henry Chaisson, Nick Antosca, and Cooper, was adapted from Antosca's short story \"The Quiet Boy\", originally published in Guernica magazine in January 2019.",
                "https://m.media-amazon.com/images/M/MV5BY2UzODAyNjktN2MwYy00M2RkLThiOTEtMjU1MTgxY2EzM2YyXkEyXkFqcGdeQXVyODk5MDA0MDU@._V1_.jpg",
                "Scott Cooper",
                "TSG Entertainment",
                "$1.7 million",
                "Thriller",
                "2021",
                "https://www.imdb.com/title/tt7740510/"
            )
        )

        movies.add(
            MovieEntity(
                "mv3",
                "The Grand Duke of Corsica",
                "In 1221 a young man is set on his path to becoming St. Francis of Assisi. A thousand years later an architect must build a mausoleum for a dying billionaire. Separated by history, these men's lives will be forever changed by a pandemic.",
                "https://m.media-amazon.com/images/M/MV5BZDc1ZGEwMzAtYjc5NC00ZTA4LWIxYTItMWRjYzM4ZjJjN2ZhXkEyXkFqcGdeQXVyMjgxOTM1MDU@._V1_.jpg",
                "Daniel Graham",
                "Camelot Films",
                "$7.000.000",
                "Comedy",
                "2021",
                "https://www.imdb.com/title/tt8400856/"
            )
        )

        movies.add(
            MovieEntity(
                "mv4",
                "Eternals",
                "Following the events of Avengers: Endgame (2019), an unexpected tragedy forces the Eternals, ancient aliens who have been living on Earth in secret for thousands of years, out of the shadows to reunite against mankind's most ancient enemy, the Deviants.",
                "https://pelopor.id/wp-content/uploads/2021/10/eternals.jpg",
                "Chloé Zhao",
                "Marvel Studios",
                "$200 million",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt9032400/"
            )
        )

        movies.add(
            MovieEntity(
                "mv5",
                "Spider-Man: No Way Home",
                "For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero is unmasked and no longer able to separate his normal life from the high-stakes of being a Super Hero. When he asks for help from Doctor Strange, the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "https://images.thedirect.com/media/article_full/spider-man-no-way-home-trailer-2.jpg",
                "Jon Watts",
                "Marvel Studios",
                "Unknown",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt10872600/"
            )
        )

        movies.add(
            MovieEntity(
                "mv6",
                "Spencer",
                "Spencer is a 2021 biographical psychological drama film directed by Pablo Larraín and written by Steven Knight.[4] The film stars Kristen Stewart as Diana, Princess of Wales (née Spencer), and follows Diana's decision to end her marriage to Prince Charles (played by Jack Farthing) and leave the British royal family. Timothy Spall, Sean Harris, and Sally Hawkins also star.",
                "https://upload.wikimedia.org/wikipedia/en/thumb/e/ea/Spencer_%28film%29.png/220px-Spencer_%28film%29.png",
                "Pablo Larrain",
                "Komplizen Film",
                "Unknown",
                "Biography",
                "2021",
                "https://www.imdb.com/title/tt12536294/"
            )
        )

        movies.add(
            MovieEntity(
                "mv7",
                "Dangerous",
                "Dangerous is an upcoming action thriller film directed by David Hackl and starring Scott Eastwood, Tyrese Gibson, Famke Janssen, Kevin Durand, and Mel Gibson.[3][4][5][6] The film is scheduled to release in theatres and on-demand on November 5, 2021.",
                "https://upload.wikimedia.org/wikipedia/en/4/45/Dangerous_%28film%29.jpg",
                "David Hackl",
                "Mind's Eye Entertainment",
                "$10 million",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt3876910/"
            )
        )

        movies.add(
            MovieEntity(
                "mv8",
                "Sooryavanshi",
                "Sooryavanshi traces the acts and serious antics of DCP Veer Sooryavanshi, the chief of the Anti-Terrorism Squad in India.",
                "https://m.media-amazon.com/images/M/MV5BNDI3M2E5ZGQtZjVlNS00NzFhLTg0NTAtZDZmOTBjODg3ZDQ1XkEyXkFqcGdeQXVyNzkxOTEyMjI@._V1_.jpg",
                "Rohit Shetty",
                "Dharma Productions",
                "Unknown",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt9531772/"
            )
        )

        movies.add(
            MovieEntity(
                "mv9",
                "The Beta Test",
                "A married Hollywood agent receives a mysterious letter for an anonymous sexual encounter and becomes ensnared in a sinister world of lying, infidelity, and digital data.",
                "https://m.media-amazon.com/images/M/MV5BOTE4ZjI4ZjMtMzJhOS00Y2U5LTg3YTAtZjcyZmU1NjAyNjRjXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
                "Jim Cummings",
                "Vanishing Angle",
                "Unknown",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt11738830/"
            )
        )

        movies.add(
            MovieEntity(
                "mv10",
                "Ida Red",
                "Ida \"Red\" Walker may not survive her terminal illness while incarcerated for armed robbery. She turns to her son, Wyatt, for one last job and a chance to regain her freedom.",
                "https://m.media-amazon.com/images/M/MV5BYTUwMWVlNzctYmExMy00ODY3LWI5ZjktZTJmZTc3ZWZkNjBhXkEyXkFqcGdeQXVyMjEzMjMzNDc@._V1_.jpg",
                "John Swab",
                "Roxwell Films",
                "Ida Red is a 2021 American crime drama film written and directed by John Swab and starring Melissa Leo, Frank Grillo and Josh Hartnett. It had its world premiere at the Locarno Film Festival on August 11, 2021, and it is scheduled to be released in the United States on November 5, 2021 by Saban Films.",
                "Action",
                "2021",
                "https://www.imdb.com/title/tt11388416/"
            )
        )

        return movies

    }

    fun generateDummyTvShows(): List<TvShowEntity> {

        val shows = ArrayList<TvShowEntity>()

        shows.add(
            TvShowEntity(
                "tv1",
                "13 Reasons Why",
                "13 Reasons Why is an American teen drama streaming television series developed for Netflix by Brian Yorkey, based on the 2007 novel Thirteen Reasons Why by Jay Asher. The series revolves around high school student Clay Jensen and the aftermath of high school student Hannah Baker's suicide.[4] Before her death, she leaves behind a box of cassette tapes in which she details the reasons why she chose to end her life as well as the people she believes are responsible for her death.",
                "https://images-na.ssl-images-amazon.com/images/I/918KkftCUFL.jpg",
                "Teen Drama",
                "United States",
                "2017",
                "4 Seasons",
                "https://www.imdb.com/title/tt1837492/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv2",
                "The Good Doctor",
                "The Good Doctor is an American medical drama television series based on the 2013 South Korean series of the same name. Actor Daniel Dae Kim noticed the original series and bought the rights for his production company. He began adapting the series and, in 2015, eventually shopped it to CBS, his home network. CBS decided against creating a pilot. Because Kim felt so strongly about the series, he bought back the rights from CBS. Eventually, Sony Pictures Television and Kim worked out a deal and brought on David Shore, creator of the Fox medical drama House, to develop the series.",
                "https://m.media-amazon.com/images/M/MV5BMTViMDJlYzEtOTUxNi00ZTU5LWI5MTYtMGViNTQ4NTVkYTMyXkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_.jpg",
                "Medical Drama",
                "United States",
                "2017",
                "4 Seasons",
                "https://www.imdb.com/title/tt6470478/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv3",
                "Peaky Blinders",
                "Peaky Blinders is a British period crime drama television series created by Steven Knight. Set in Birmingham, England, the series follows the exploits of the Shelby crime family in the direct aftermath of the First World War. The fictional family is loosely based on a real urban youth gang of the same name, who were active in the city from the 1890s to the early 20th century.",
                "https://flxt.tmsimg.com/assets/p11094767_b_v13_aa.jpg",
                "Action",
                "United Kingdom",
                "2014",
                "5",
                "https://www.imdb.com/title/tt2442560/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv4",
                "Vikings",
                "Vikings is a historical drama television series created and written by Michael Hirst for the History channel, a Canadian network. Filmed in Ireland, it premiered on March 3, 2013, in Canada. The series concluded on December 30, 2020, when the second half of the sixth season was released in its entirety on Amazon Prime Video in Ireland, ahead of its broadcast on History in Canada from January 1 to March 3, 2021. A sequel series, titled Vikings: Valhalla, is still in development for Netflix.",
                "https://www.withanaccent.com/wp-content/uploads/2020/04/Vikings-poster.jpg",
                "Action",
                "Canada",
                "2013",
                "6",
                "https://www.imdb.com/title/tt2306299/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv5",
                "The Queen's Gambit",
                "In a 1950s orphanage, a young girl reveals an astonishing talent for chess and begins an unlikely journey to stardom while grappling with addiction.",
                "https://m.media-amazon.com/images/M/MV5BM2EwMmRhMmUtMzBmMS00ZDQ3LTg4OGEtNjlkODk3ZTMxMmJlXkEyXkFqcGdeQXVyMjM5ODk1NDU@._V1_.jpg",
                "Drama",
                "United States",
                "2020",
                "1",
                "https://www.imdb.com/title/tt10048342/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv6",
                "Mr. Robot",
                "Elliot, a brilliant but highly unstable young cyber-security engineer and vigilante hacker, becomes a key figure in a complex game of global dominance when he and his shadowy allies try to take down the corrupt corporation he works for.",
                "https://m.media-amazon.com/images/M/MV5BMzgxMmQxZjQtNDdmMC00MjRlLTk1MDEtZDcwNTdmOTg0YzA2XkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_.jpg",
                "Crime",
                "United States",
                "2015",
                "4",
                "https://www.imdb.com/title/tt4158110/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv7",
                "Game Of Thrones",
                "Game of Thrones is an American fantasy drama television series created by David Benioff and D. B. Weiss for HBO. It is an adaptation of A Song of Ice and Fire, a series of fantasy novels by George R. R. Martin, the first of which is A Game of Thrones. The show was shot in the United Kingdom, Canada, Croatia, Iceland, Malta, Morocco, and Spain. It premiered on HBO in the United States on April 17, 2011, and concluded on May 19, 2019, with 73 episodes broadcast over eight seasons.",
                "https://i.pinimg.com/originals/4a/7f/86/4a7f8662523c78ed18cc5a77534015ad.jpg",
                "Action",
                "United States, United Kingdom",
                "2011",
                "8",
                "https://www.imdb.com/title/tt0944947/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv8",
                "Stranger Things",
                "Stranger Things is an American science fiction horror drama television series created by the Duffer Brothers and streaming on Netflix. The brothers serve as showrunners and are executive producers along with Shawn Levy and Dan Cohen. The series premiered on Netflix on July 15, 2016. Set in the 1980s in the fictional town of Hawkins, Indiana, the first season focuses on the investigation into the disappearance of a young boy (Will Byers) amid supernatural events occurring around the town, including the appearance of a girl with psychokinetic abilities (Eleven). The second season focuses on Will's side effects from being in the Upside Down with its entities crawling into the real world. The third season focuses Eleven and Mike's relationship as the kids continue their battle against the Upside Down entities. The series stars an ensemble cast including Winona Ryder, David Harbour, Finn Wolfhard, Millie Bobby Brown, Gaten Matarazzo, Caleb McLaughlin, Noah Schnapp, Sadie Sink, Natalia Dyer, Charlie Heaton, Joe Keery, Cara Buono and Dacre Montgomery.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Stranger_Things_logo.png/250px-Stranger_Things_logo.png",
                "Sci-Fi",
                "United States",
                "2016",
                "3",
                "https://www.imdb.com/title/tt4574334/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv9",
                "Euphoria",
                "Euphoria is an American teen drama television series created and written by Sam Levinson for HBO. It is loosely based on the Israeli television miniseries of the same name created by Ron Leshem and Daphna Levin. It follows a group of high school students through their experiences of sex, drugs, friendships, love, identity, and trauma. The series stars Zendaya in the lead role, alongside an ensemble cast consisting of Maude Apatow, Angus Cloud, Eric Dane, Alexa Demie, Jacob Elordi, Barbie Ferreira, Nika King, Storm Reid, Hunter Schafer, Algee Smith, Sydney Sweeney, and Colman Domingo. It premiered on June 16, 2019. In July 2019, the series was renewed for a second season, preceded by two one-hour specials broadcast in December 2020 and January 2021.",
                "https://upload.wikimedia.org/wikipedia/en/thumb/c/ca/Euphoria_intertitle.png/250px-Euphoria_intertitle.png",
                "Drama",
                "United States",
                "2019",
                "1",
                "https://www.imdb.com/title/tt8772296/"
            )
        )

        shows.add(
            TvShowEntity(
                "tv10",
                "The End of the F***ing World",
                "James is 17 and is pretty sure he is a psychopath. Alyssa, also 17, is the cool and moody new girl at school. The pair make a connection and she persuades him to embark on a road trip in search of her real father.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/The_End_of_the_F%2A%2A%2Aing_World_logo.png/250px-The_End_of_the_F%2A%2A%2Aing_World_logo.png",
                "Drama",
                "United Kingdom",
                "2017",
                "2",
                "https://www.imdb.com/title/tt6257970/"
            )
        )

        return shows

    }
}