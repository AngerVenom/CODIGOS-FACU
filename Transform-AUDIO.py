from gtts import gTTS

from playsound import playsound

audio = 'speech.mp3'
language = 'es' # el language es es español y en es english
sp = gTTS(text ="HOLAAAAA", lang= language, slow=False)

sp.save(audio)
playsound(audio)
