<script setup>
import {onMounted, ref} from "vue";
import { useProjectStore} from "@/stores/project";
import AProjectCard from "@/components/admin/A-ProjectCard.vue";

const projectStore = useProjectStore();

const data = ref({title: "", description: ""})
const createProject = () => {
  projectStore.createProject(data.value).then(() => {
    data.value.title = "";
    data.value.description = "";
  });

}

onMounted(()=> projectStore.getProjects())

</script>

<template>
  <section class="section">
    <div class="row">
      <AProjectCard
          v-for="project in projectStore.projects"
          :key="project.id"
          :id="project.id"
          :title="project.title"
          :description="project.description"
      />
    </div>
    <div class="container text-center">
      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#verticalycentered">
        <i class="bi bi-folder-plus me-1"></i> Добавить проект
      </button>
        <div class="modal fade" id="verticalycentered" tabindex="-1">
          <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title">Создание проекта</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                <form>
                  <div class="row mb-3">
                    <div class="col-sm-12">
                      <div class="form-floating mb-3">
                        <input v-model="data.title" type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                        <label for="floatingInput">Название</label>
                      </div>
                      <div class="form-floating mb-3">
                        <textarea v-model="data.description" class="form-control" placeholder="Leave a comment here" id="floatingTextarea" style="height: 100px;"></textarea>
                        <label for="floatingTextarea">Описание</label>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
                <button @click.prevent="createProject" type="button" class="btn btn-primary">Сохранить</button>
              </div>
            </div>
          </div>
        </div>
    </div>


  </section>
</template>
