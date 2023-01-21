
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.model.Puppy

object DataProvider {

    val puppy =
        Puppy(
            id = 1,
            title = "Cooper",
            sex = "Female",
            age = 4,
            description = "I'm Cooper and I love to bark.",
            puppyImageId = R.drawable.p1
        )

    val puppyList = listOf(
        puppy,
        Puppy(
            id = 2,
            title = "Milo",
            sex = "Female",
            age = 9,
            description = "How's it going?",
            puppyImageId = R.drawable.p2
        ),
        Puppy(
            id = 3,
            title = "Finn",
            sex = "Male",
            age = 2,
            description = "Finn in honor of Finland.",
            puppyImageId = R.drawable.p3
        ),
        Puppy(
            id = 4,
            title = "Charlie",
            sex = "Female",
            age = 5,
            description = "I like my fur.",
            puppyImageId = R.drawable.p4
        ),
        Puppy(
            id = 5,
            title = "Tucker",
            sex = "Female",
            age = 15,
            description = "One day I will be bigger, but in this life I have had enough.",
            puppyImageId = R.drawable.p5
        ),
        Puppy(
            id = 6,
            title = "Ollie",
            sex = "Female",
            age = 3,
            description = "Very serious in life.",
            puppyImageId = R.drawable.p6
        ),
        Puppy(
            id = 7,
            title = "Bear",
            sex = "Male",
            age = 9,
            description = "My name is Bear and I love soft toys.",
            puppyImageId = R.drawable.p7
        ),
        Puppy(
            id = 8,
            title = "Max",
            sex = "Female",
            age = 9,
            description = "my master left home today, so I'm sad(",
            puppyImageId = R.drawable.p8
        ),
        Puppy(
            id = 9,
            title = "Darmidont",
            sex = "Female",
            age = 7,
            description = "I don't understand where the owner goes when he walks out the door. Is he standing there for 8 hours?",
            puppyImageId = R.drawable.p9
        ),
        Puppy(
            id = 10,
            title = "Mustafa",
            sex = "Male",
            age = 10,
            description = "My mistress swears when I poop at home, but why?",
            puppyImageId = R.drawable.p10
        ),
        Puppy(
            id = 11,
            title = "Bench",
            sex = "Male",
            age = 11,
            description = "I love to sleep with my mistress in bed.",
            puppyImageId = R.drawable.p11
        ),
        Puppy(
            id = 12,
            title = "Grogh",
            sex = "Female",
            age = 10,
            description = "I often get sniffed by other dogs on the street. What, do they like me?",
            puppyImageId = R.drawable.p12
        ),
    )
}
