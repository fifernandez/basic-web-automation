package steps

import geb.Browser
import pages.GoogleHomePage
import static cucumber.api.groovy.EN.*

When(~/I go to the '((?:Google Home))' page/) { String page ->

    switch (page) {
        case 'Google Home':
            to GoogleHomePage
            break
    }

}

Then(~/The title of the page must contain '(.*)'/) { String correct ->

    assert page.title.contains(correct)

}



When(~/I go to youtube page for vid: '(.*)' and play it for 30 secs/) { String vid ->

    20.times {
        Browser.drive {
            go "https://youtu.be/${vid}"
            sleep(60000)
            println 'done'
        }
    }

}