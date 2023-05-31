<script setup>
import { useLectureStore } from "@/stores/lecture";
import {onMounted} from "vue";

const lectureStore = useLectureStore();

onMounted(()=> lectureStore.getLectures())

</script>
<template>
<section class="section">
  <div class="row align-items-top">
    <div class="col-lg-6">
<!--      <AChapter-->
<!--          v-for="chapter in lectureStore.chapters"-->
<!--          :key="chapter.id"-->
<!--          :order="chapter.order"-->
<!--          :title="chapter.title"-->
<!--          :content="chapter.content"/>-->
    </div>
    <div class="col-lg-6">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Создать лекцию</h5>
          <form class="row g-3">
            <div class="col-md-10">
              <div class="form-floating">
                <input type="text" class="form-control" id="lectureTitle" placeholder="Название">
                <label for="lectureTitle">Название</label>
              </div>
            </div>
            <div class="col-md-2">
              <div class="form-floating">
                <input type="number" class="form-control" id="lectureOrder" placeholder="No" min="1">
                <label for="lectureOrder">No</label>
              </div>
            </div>
            <div class="col-md-6">
              <div class="form-floating mb-3">
                <select class="form-select" id="lectureCategory" aria-label="Project">
                  <option selected>Генератор текста</option>
                  <option value="1">Парсер</option>
                  <option value="2">Numpy</option>
                </select>
                <label for="lectureCategory">Проект</label>
              </div>
            </div>
            <div class="col-md-6">
              <div class="form-floating mb-3">
                <select class="form-select" id="lectureStage" aria-label="Stage">
                  <option selected>1 Этап</option>
                  <option value="1">2 Этап</option>
                  <option value="2">3 Этап</option>
                </select>
                <label for="lectureStage">Стадия</label>
              </div>
            </div>
            <hr class="border border-dark border-1 opacity-25">

            <div class="col-md-10">
              <div class="form-floating">
                <input type="text" class="form-control" id="lectureChapter" placeholder="Название раздела">
                <label for="lectureChapter">Название раздела</label>
              </div>
            </div>
            <div class="col-md-2">
              <div class="form-floating">
                <input type="number" class="form-control" id="chapterOrder" placeholder="No" min="1">
                <label for="chapterOrder">No</label>
              </div>
            </div>
            <div class="col-12">
              <div class="form-floating">
                <textarea class="form-control" placeholder="Address" id="chapterContent" style="height: 100px;"></textarea>
                <label for="chapterContent">Текст раздела</label>
              </div>
            </div>

            <div class="text-center">
              <button type="button" class="btn btn-primary m-1"><i class="bi bi-bookmark-plus me-1"></i>Добавить раздел</button>
              <button type="button" class="btn btn-success m-1"><i class="bi bi-check-circle me-1"></i>Сохранить лекцию</button>
              <button type="button" class="btn btn-danger m-1"><i class="bi bi-file-x me-1"></i>Отмена</button>
            </div>
          </form>

        </div>
      </div>
    </div>
  </div>
</section>
</template>
