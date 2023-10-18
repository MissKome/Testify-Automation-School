import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager


# Navigate any browser to https://weather.com/ get thecurrent  temperature  and  print  it  out  in  the  terminal.  Thenprint out the temperature for Morning, Afternoon, Evening,and Overnight
def weather(driver):
    # current temperature
    current = driver.find_element(By.XPATH, "//body/div[@id='appWrapper']/main[@id='MainContent']/div[2]/main[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
    time.sleep(5)
    print("Current temperature: ", current.text)
    # morning temperature
    morning = driver.find_element(By.XPATH, "//body/div[@id='appWrapper']/main[@id='MainContent']/div[2]/main[1]/div[3]/section[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/span[1]")
    time.sleep(5)
    print("Morning temperature: ", morning.text)
    # afternoon temperature
    afternoon = driver.find_element(By.XPATH, "//body/div[@id='appWrapper']/main[@id='MainContent']/div[2]/main[1]/div[3]/section[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]/span[1]")
    time.sleep(5)
    print("Afternoon temperature: ", afternoon.text)
    # evening temperature
    evening = driver.find_element(By.XPATH, "//body/div[@id='appWrapper']/main[@id='MainContent']/div[2]/main[1]/div[3]/section[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]/span[1]")
    time.sleep(5)
    print("Evening temperature: ", evening.text)
    # overnight temperature
    overnight = driver.find_element(By.CSS_SELECTOR, "body.ci-4881.ci-4881-open:nth-child(2) div.appWrapper.DaybreakLargeScreen.LargeScreen.lightTheme.twcTheme.DaybreakLargeScreen--appWrapper--3kKUE.gradients--cloudyFoggyDay--R2hTM.gradients--cloudyFoggyDay-top--3dKG9:nth-child(1) div.DaybreakLargeScreen--gridWrapper--3sleb main.region-main.regionMain.DaybreakLargeScreen--regionMain--1FzNI div.removeIfEmpty:nth-child(3) section.card.Card--card--2AzRg.Card--containerQuery--T7772 div.Card--content--1GQMr div.TodayWeatherCard--TableWrapper--globn ul.WeatherTable--columns--6JrVO.WeatherTable--wide--KY3eP li.Column--column--3tAuz:nth-child(4) a.Column--innerWrapper--3ocxD.Button--default--2gfm1 div.Column--temp--1sO_J > span:nth-child(1)")
    time.sleep(5)
    print("Overnight temperature: ", overnight.text)


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://weather.com")
    weather(driver)


if __name__ == '__main__':
    main()
