import {ref, computed} from 'vue'
import {defineStore} from 'pinia'
import axios from "axios";


const BASE_URL = "http://127.0.0.1:5000/projects"
export const useProjectStore = defineStore("project", () => {

    const projects = ref([]);

    const createProject = async (payload) => {
        await axios.post(BASE_URL, payload)
            .then((response) => {
                projects.value.push(response.data)
            }).catch(e => console.log(e))
    }
    const getProjects = async () => {
        await axios.get(BASE_URL)
            .then((response) => {
                projects.value = response.data
            }).catch((e) => console.log(e))
    }
    return {
        projects,
        getProjects,
        createProject
    }
})