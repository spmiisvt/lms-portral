import {ref, computed} from 'vue'
import {defineStore} from 'pinia'
import axios from "axios";


const BASE_URL = "http://127.0.0.1:5000/lectures"
export const useLectureStore = defineStore("lecture", () => {

    const lectures = ref([]);

    const createLecture = async (payload) => {
        await axios.post(BASE_URL, payload)
            .then((response) => {
                lectures.value.push(response.data)
            }).catch(e => console.log(e))
    }
    const getLectures = async () => {
        await axios.get(BASE_URL)
            .then((response) => {
                lectures.value = response.data
            }).catch((e) => console.log(e))
    }

    return {
        lectures,
        getLectures,
        createLecture
    }
})