<script setup>
import { useRoute } from "vue-router";
import {useProjectStore} from "@/stores/project";
import ATabs from "@/components/admin/A-Tabs.vue";
import {computed, onMounted, ref, unref} from "vue";
const route = useRoute();
const projectStore = useProjectStore();

const stages = ref([]);

const formStage = ref({
  title: "",
  description: "",
  order: 1
})
const addStage = () => {
  stages.value.push({
    title: unref(formStage.value.title),
    description: unref(formStage.value.description),
    order: unref(formStage.value.order)
  });
  formStage.value.title = "";
  formStage.value.description = "";
  formStage.value.order++;
}

const data = ref({title: "", description: ""})
const updateProject = () => {
  projectStore.updateProject(data.value).then(() => {
    data.value.title = "";
    data.value.description = "";
  });
}
const getProject = () => {
    projectStore.getProjectById(route.params.id)
}
onMounted(()=> getProject())

</script>

<template>
  <section class="section">
    <div class="row align-items-top">
      <div class="col-lg-6">
        <ATabs :stages="stages" :title="projectStore.currentProject.title"/>
      </div>
      <div class="col-lg-6">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Управление проектом</h5>
            <div class="row g-3">
              <div class="col-md-12">
                <div class="form-floating">
                  <input
                      type="text"
                      class="form-control"
                      id="projectTitle"
                      placeholder="Название"
                      :value="projectStore.currentProject.title">
                  <label for="projectTitle">Название</label>
                </div>
              </div>
              <div class="col-12">
                <div class="form-floating">
                  <textarea
                      :value="projectStore.currentProject.description"
                      class="form-control"
                      placeholder="chapterContent"
                      id="chapterContent"
                            style="height: 100px;"></textarea>
                  <label for="chapterContent">Описание проекта</label>
                </div>
              </div>
              <div class="text-left">
                <button type="button" class="btn btn-success m-1"><i class="bi bi-check-circle me-1"></i>Сохранить
                </button>
              </div>
            </div>
          </div>
        </div>
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Управление этапами</h5>
            <div class="row g-3">
              <div class="col-md-10">
                <div class="form-floating">
                  <input v-model="formStage.title" type="text" class="form-control" id="projectStage" placeholder="Название этапа">
                  <label for="projectStage">Название этапа</label>
                </div>
              </div>
              <div class="col-md-2">
                <div class="form-floating">
                  <input v-model="formStage.order" type="number" class="form-control" id="stageOrder" placeholder="No" min="1">
                  <label for="stageOrder">No</label>
                </div>
              </div>
              <div class="col-12">
                <div class="form-floating">
                  <textarea v-model="formStage.description" class="form-control" placeholder="Stage" id="stageDescription"
                            style="height: 100px;"></textarea>
                  <label for="stageDescription">Описание Этапа</label>
                </div>
              </div>

              <div class="text-center">
                <button @click.prevent="addStage" type="button" class="btn btn-primary m-1"><i class="bi bi-bookmark-plus me-1"></i>Добавить
                </button>
                <button type="button" class="btn btn-success m-1"><i class="bi bi-check-circle me-1"></i>Сохранить
                </button>
                <button type="button" class="btn btn-danger m-1"><i class="bi bi-file-x me-1"></i>Удалить</button>
              </div>
            </div>

          </div>
        </div>
      </div>
    </div>
  </section>
</template>